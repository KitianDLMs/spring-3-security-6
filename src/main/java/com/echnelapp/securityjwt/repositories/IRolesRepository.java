package com.echnelapp.securityjwt.repositories;

import com.echnelapp.securityjwt.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Long> {

    public Optional<Roles> findByName(String name);
}
