package com.cice.GestionComentariosNoticias.controler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)

public class ComentarioDTO {
    private Long id;
    private Long idNoticiaComentada;
    private String textoComentario;
    private String autorComentario;
    private String fechaComentario;

}
