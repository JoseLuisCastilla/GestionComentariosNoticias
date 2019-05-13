package com.cice.GestionComentariosNoticias.controler;

import com.cice.GestionComentariosNoticias.controler.dto.ComentarioDTO;
import com.cice.GestionComentariosNoticias.service.ComentariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ComentariosResource {
    @Autowired
    ComentariosService comentariosService;

    public ResponseEntity<ComentarioDTO> crearComentario(@RequestBody ComentarioDTO comentarioDTO){
        ResponseEntity<ComentarioDTO> response = null;

        return response;
    }

}
