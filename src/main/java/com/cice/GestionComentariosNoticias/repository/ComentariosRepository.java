package com.cice.GestionComentariosNoticias.repository;

import com.cice.GestionComentariosNoticias.repository.entity.ComentarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentariosRepository extends JpaRepository<ComentarioEntity, Long> {
}
