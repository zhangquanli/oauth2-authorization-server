package com.github.zhangquanli.server.authorization.config;

import com.github.zhangquanli.server.authorization.entity.Account;
import com.github.zhangquanli.server.authorization.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Slf4j
@Component
public class JpaUserDetailsService implements UserDetailsService, InitializingBean {
    private final AccountRepository accountRepository;

    public JpaUserDetailsService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("username '" + username + "' not found"));
        return new User(account.getUsername(), account.getPassword(), Collections.singletonList(new SimpleGrantedAuthority("user")));
    }

    @Override
    public void afterPropertiesSet() {
        String username = "username";
        String password = "password";
        String email = "test@qq.com";
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        Account account = new Account();
        account.setId(1L);
        account.setUsername(username);
        account.setPassword(encoder.encode(password));
        account.setEmail(email);
        accountRepository.save(account);
        log.info("创建测试账户：{}", account);
    }
}
