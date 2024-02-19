package com.echnelapp.securityjwt.repositories;

import com.echnelapp.securityjwt.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Long> {
    public Optional<Usuarios> findByUsername(String username);
    public Boolean existsByUsername(String username);
}
