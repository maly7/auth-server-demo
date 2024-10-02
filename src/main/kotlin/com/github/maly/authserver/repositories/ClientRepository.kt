package com.github.maly.authserver.repositories

import com.github.maly.authserver.entities.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface ClientRepository : JpaRepository<Client, String> {
    fun findByClientId(clientId: String): Optional<Client>
}
