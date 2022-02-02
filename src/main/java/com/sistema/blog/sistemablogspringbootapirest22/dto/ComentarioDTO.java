package com.sistema.blog.sistemablogspringbootapirest22.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ComentarioDTO {

    private long id;

    @NotEmpty(message = "El campo comentario no puede estar vacio")
    private String nombre;

    @NotEmpty(message = "El campo email no puede estar vacio")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, max = 300, message = "El comentario debe tener entre 10 y 300 caracteres")
    private String cuerpo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public ComentarioDTO() {
        super();
    }

    public ComentarioDTO(long id, String nombre, String email, String cuerpo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.cuerpo = cuerpo;
    }

}
