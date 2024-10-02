package com.github.maly.authserver.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant

@Entity
@Table(name = "authorization")
data class Authorization(
    @Id
    @Column
    var id: String,
    var registeredClientId: String,
    var principalName: String,
    var authorizationGrantType: String,
    @Column(length = 1000)
    var authorizedScopes: String?,
    @Column(length = 4000)
    var attributes: String?,
    @Column(length = 500)
    var state: String?,
    @Column(length = 4000)
    var authorizationCodeValue: String?,
    var authorizationCodeIssuedAt: Instant?,
    var authorizationCodeExpiresAt: Instant?,
    var authorizationCodeMetadata: String?,
    @Column(length = 4000)
    var accessTokenValue: String?,
    var accessTokenIssuedAt: Instant?,
    var accessTokenExpiresAt: Instant?,
    @Column(length = 2000)
    var accessTokenMetadata: String?,
    var accessTokenType: String?,
    @Column(length = 1000)
    var accessTokenScopes: String?,
    @Column(length = 4000)
    var refreshTokenValue: String?,
    var refreshTokenIssuedAt: Instant?,
    var refreshTokenExpiresAt: Instant?,
    @Column(length = 2000)
    var refreshTokenMetadata: String?,
    @Column(length = 4000)
    var oidcIdTokenValue: String?,
    var oidcIdTokenIssuedAt: Instant?,
    var oidcIdTokenExpiresAt: Instant?,
    @Column(length = 2000)
    var oidcIdTokenMetadata: String?,
    @Column(length = 2000)
    var oidcIdTokenClaims: String?,
    @Column(length = 4000)
    var userCodeValue: String?,
    var userCodeIssuedAt: Instant?,
    var userCodeExpiresAt: Instant?,
    @Column(length = 2000)
    var userCodeMetadata: String?,
    @Column(length = 4000)
    var deviceCodeValue: String?,
    var deviceCodeIssuedAt: Instant?,
    var deviceCodeExpiresAt: Instant?,
    @Column(length = 2000)
    var deviceCodeMetadata: String?,
) {
    constructor() : this(
        "",
        "",
        "",
        "",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
    )
}
