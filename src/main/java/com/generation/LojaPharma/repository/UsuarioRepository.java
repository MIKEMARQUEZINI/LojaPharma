package com.generation.LojaPharma.repository;

import com.generation.LojaPharma.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Optional <Usuario> findByUsuario(@Param("tipo") String usuario);
}