package com.sistema.blog.sistemablogspringbootapirest22.repositorio;

import com.sistema.blog.sistemablogspringbootapirest22.entidades.Publicacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacionRepositorio extends JpaRepository<Publicacion, Long> {

}