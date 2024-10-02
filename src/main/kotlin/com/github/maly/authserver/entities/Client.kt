package com.github.maly.authserver.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant

@Entity
@Table(name = "client")
data class Client(
    @Id
    var id: String,
    var clientId: String,
    var clientIdIssuedAt: Instant,
    var clientSecret: String?,
    var clientSecretExpiresAt: Instant?,
    var clientName: String,
    @Column(length = 1000)
    var clientAuthenticationMethods: String,
    @Column(length = 1000)
    var authorizationGrantTypes: String,
    @Column(length = 1000)
    var redirectUris: String?,
    @Column(length = 1000)
    var postLogoutRedirectUris: String?,
    @Column(length = 1000)
    var scopes: String,
    @Column(length = 2000)
    var clientSettings: String,
    @Column(length = 2000)
    var tokenSettings: String,
) {
    constructor() : this(
        "",
        "",
        Instant.now(),
        "",
        null,
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
    )
}
