package com.cice.GestionComentariosNoticias.service.converter;

import com.cice.GestionComentariosNoticias.controler.dto.ComentarioDTO;
import com.cice.GestionComentariosNoticias.repository.entity.ComentarioEntity;

public class DTOentityConverter {
    public ComentarioEntity mapDTOToEntity(ComentarioDTO comentarioDTO) {
        ComentarioEntity comentarioEntity = null;

        comentarioEntity = new ComentarioEntity()
                .setId(comentarioDTO.getId())
                .setIdNoticiaComentada(comentarioDTO.getIdNoticiaComentada())
                .setTextoComentario(comentarioDTO.getTextoComentario())
                .setAutorComentario(comentarioDTO.getAutorComentario())
                .setFechaComentario(comentarioDTO.getFechaComentario());

        return comentarioEntity;
    }

    public ComentarioDTO mapEntityToDTO(ComentarioEntity comentarioEntity) {
        ComentarioDTO comentarioDTO = null;

        comentarioDTO = new ComentarioDTO().setId(comentarioEntity.getId())
                .setIdNoticiaComentada(comentarioEntity.getIdNoticiaComentada())
                .setTextoComentario(comentarioEntity.getTextoComentario())
                .setAutorComentario(comentarioEntity.getAutorComentario())
                .setFechaComentario(comentarioEntity.getFechaComentario());


        return comentarioDTO;

    }
}