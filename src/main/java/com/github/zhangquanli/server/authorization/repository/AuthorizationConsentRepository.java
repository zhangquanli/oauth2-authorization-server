package com.github.zhangquanli.server.authorization.repository;

import com.github.zhangquanli.server.authorization.entity.AuthorizationConsent;
import com.github.zhangquanli.server.authorization.entity.AuthorizationConsent.AuthorizationConsentId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorizationConsentRepository extends JpaRepository<AuthorizationConsent, AuthorizationConsentId> {
    Optional<AuthorizationConsent> findByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);

    void deleteByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);
}
