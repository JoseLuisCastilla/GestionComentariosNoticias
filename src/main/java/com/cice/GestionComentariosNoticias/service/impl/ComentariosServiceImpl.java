package com.cice.GestionComentariosNoticias.service.impl;

import com.cice.GestionComentariosNoticias.controler.dto.ComentarioDTO;
import com.cice.GestionComentariosNoticias.repository.ComentariosRepository;
import com.cice.GestionComentariosNoticias.repository.entity.ComentarioEntity;
import com.cice.GestionComentariosNoticias.service.ComentariosService;
import com.cice.GestionComentariosNoticias.service.converter.DTOentityConverter;
import org.springframework.beans.factory.annotation.Autowired;

public class ComentariosServiceImpl implements ComentariosService {
    @Autowired
    ComentariosRepository comentariosRepository;

    DTOentityConverter mapper = new DTOentityConverter();

    @Override
    public ComentarioDTO crearComentario(ComentarioDTO comentarioDTO) {
        ComentarioDTO responseDTO = null;
        ComentarioEntity comentarioEntity = comentariosRepository.save(mapper.mapDTOToEntity(comentarioDTO));
        responseDTO = mapper.mapEntityToDTO(comentarioEntity);
        return responseDTO;
    }
}
