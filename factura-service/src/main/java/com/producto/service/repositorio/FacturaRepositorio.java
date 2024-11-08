package com.producto.service.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.fm.app.entity.Factura;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura, Integer>{

	List<Factura> findByUsuarioId(int usuarioId);

}
