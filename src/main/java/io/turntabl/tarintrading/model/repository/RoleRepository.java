package io.turntabl.tarintrading.model.repository;

import io.turntabl.tarintrading.model.ERole;
import io.turntabl.tarintrading.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
