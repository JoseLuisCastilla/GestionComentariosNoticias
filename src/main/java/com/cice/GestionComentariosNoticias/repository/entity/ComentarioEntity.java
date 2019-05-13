package com.cice.GestionComentariosNoticias.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "comentario")

public class ComentarioEntity {
    private Long id;
    private Long idNoticiaComentada;
    private String textoComentario;
    private String autorComentario;
    private String fechaComentario;

}
