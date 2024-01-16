package com.github.zhangquanli.server.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationServerApplication {

    public static void main(String[] args) {
        log.info("命令行参数：{}", Arrays.toString(args));
        SpringApplication.run(AuthorizationServerApplication.class, args);
    }

}
