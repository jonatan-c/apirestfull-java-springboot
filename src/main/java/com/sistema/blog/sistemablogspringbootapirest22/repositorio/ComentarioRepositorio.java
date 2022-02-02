package com.sistema.blog.sistemablogspringbootapirest22.repositorio;

import java.util.List;

import com.sistema.blog.sistemablogspringbootapirest22.entidades.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepositorio extends JpaRepository<Comentario, Long> {

    public List<Comentario> findByPublicacionId(Long publicacionId);
}
