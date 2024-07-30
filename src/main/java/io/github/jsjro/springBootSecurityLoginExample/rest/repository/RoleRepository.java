package io.github.jsjro.springBootSecurityLoginExample.rest.repository;

import io.github.jsjro.springBootSecurityLoginExample.rest.model.ERole;
import io.github.jsjro.springBootSecurityLoginExample.rest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}