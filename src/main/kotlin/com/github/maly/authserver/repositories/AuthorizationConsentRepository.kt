package com.github.maly.authserver.repositories

import com.github.maly.authserver.entities.AuthorizationConsent
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface AuthorizationConsentRepository : JpaRepository<AuthorizationConsent, AuthorizationConsent.AuthorizationConsentId> {
    fun findByRegisteredClientIdAndPrincipalName(
        registeredClientId: String?,
        principalName: String?,
    ): Optional<AuthorizationConsent?>?

    fun deleteByRegisteredClientIdAndPrincipalName(
        registeredClientId: String?,
        principalName: String?,
    )
}
