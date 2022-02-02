package com.sistema.blog.sistemablogspringbootapirest22.repositorio;

import java.util.Optional;

import com.sistema.blog.sistemablogspringbootapirest22.entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByEmail(String email);

    public Optional<Usuario> findByUsernameOrEmail(String username, String email);

    public Optional<Usuario> findByUsername(String username);

    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);

}
