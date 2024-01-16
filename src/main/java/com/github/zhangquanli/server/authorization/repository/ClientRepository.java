package com.github.zhangquanli.server.authorization.repository;

import com.github.zhangquanli.server.authorization.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, String> {
    Optional<Client> findByClientId(String clientId);
}
