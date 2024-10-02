package com.github.maly.authserver.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import jakarta.persistence.Table
import java.io.Serializable

@Entity
@Table(name = "authorizationConsent")
@IdClass(AuthorizationConsent.AuthorizationConsentId::class)
data class AuthorizationConsent(
    @Id
    var registeredClientId: String,
    @Id
    var principalName: String,
    @Column(length = 1000)
    var authorities: String?,
) {
    constructor() : this(
        "",
        "",
        "",
    )

    data class AuthorizationConsentId(
        var registeredClientId: String = "",
        var principalName: String = "",
    ) : Serializable
}
