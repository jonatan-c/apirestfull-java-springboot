package com.sistema.blog.sistemablogspringbootapirest22.servicio;


import com.sistema.blog.sistemablogspringbootapirest22.dto.PublicacionDTO;
import com.sistema.blog.sistemablogspringbootapirest22.dto.PublicacionRespuesta;

public interface PublicacionServicio {
    
    public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO);

    public PublicacionRespuesta obtenerTodasLasPublicaciones(int numeroDePagina, int medidaDePagina,String ordenarPor,String sortDir);

    public PublicacionDTO obtenerPublicacionPorId(Long id);

    public PublicacionDTO actualizarPublicacion(PublicacionDTO publicacionDTO, Long id);

    public void eliminarPublicacion(Long id);
}
