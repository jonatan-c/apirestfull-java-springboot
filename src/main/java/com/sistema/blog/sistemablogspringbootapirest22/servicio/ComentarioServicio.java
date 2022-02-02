package com.sistema.blog.sistemablogspringbootapirest22.servicio;

import java.util.List;

import com.sistema.blog.sistemablogspringbootapirest22.dto.ComentarioDTO;

public interface ComentarioServicio {

    public ComentarioDTO crearComentario(long publicacionId, ComentarioDTO comentarioDTO);

    public List<ComentarioDTO> obtenerComentariosPorPublicacionId(long publicacionId);

    public ComentarioDTO obtenerComentarioPorId(long publicacionId, long comentarioId);

    public ComentarioDTO actualizarComentario(long publicacionId, long comentarioId,
            ComentarioDTO solicitudDeComentario);

    public void eliminarComentario(long publicacionId, long comentarioId);
}
