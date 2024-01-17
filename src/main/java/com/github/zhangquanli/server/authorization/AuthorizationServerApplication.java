package com.github.zhangquanli.server.authorization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class AuthorizationServerApplication {

    public static void main(String[] args) {
        log.info("命令行参数：{}", Arrays.toString(args));
        SpringApplication.run(AuthorizationServerApplication.class, args);
    }

}
