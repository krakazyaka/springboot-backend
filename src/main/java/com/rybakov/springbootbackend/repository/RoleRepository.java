package com.rybakov.springbootbackend.repository;

import java.util.Optional;

import com.rybakov.springbootbackend.models.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rybakov.springbootbackend.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
