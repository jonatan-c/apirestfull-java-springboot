package com.sistema.blog.sistemablogspringbootapirest22.repositorio;

import java.util.Optional;

import com.sistema.blog.sistemablogspringbootapirest22.entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepositorio extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByNombre(String nombre);

}
