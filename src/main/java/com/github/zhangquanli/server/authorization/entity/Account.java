package com.github.zhangquanli.server.authorization.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "t_account")
@Entity
@Getter
@Setter
public class Account {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
