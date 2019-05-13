package com.cice.GestionComentariosNoticias.service;

import com.cice.GestionComentariosNoticias.controler.dto.ComentarioDTO;

/**
 * Interfaz que contendra los metodos de la logica de negocio para el resource Comentarios
 */

public interface ComentariosService {
    /**
     * Metodo que crea un comentario en base a los datos recibidos desde el resource
     *
     * @param comentarioDTO para almacenar en base de datos
     * @return ComentarioDTO con el ID unico
     */
     ComentarioDTO crearComentario(ComentarioDTO comentarioDTO);

}
