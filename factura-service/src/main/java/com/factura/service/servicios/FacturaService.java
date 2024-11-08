package com.factura.service.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.fm.app.entity.Factura;
import com.sistema.fm.app.repository.FacturaRepository;

@Service
public class FacturaService {

	@Autowired
	private FacturaRepository facturaRepository;

	public List<Factura> getAll() {
		return facturaRepository.findAll();
	}

	public Factura getProductoById(int id) {
		return facturaRepository.findById(id).orElse(null);

	}

	public Factura save(Factura factura) {
		Factura nuevaFactura = facturaRepository.save(factura);
		return nuevaFactura;
	}

	public static Factura getFacturaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Factura> byUsuarioId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Factura crearFactura(Factura factura) {
		// TODO Auto-generated method stub
		return null;
	}

	public Factura obtenerFactura(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
