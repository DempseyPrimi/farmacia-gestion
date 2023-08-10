package com.farmacia.uth.data.controller;

import java.io.IOException;

import com.farmacia.uth.data.entity.Productos;

public interface ProductosInteractor {
	void consultarProductos();
	void crearProducto(Productos producto) throws IOException;
	
	void consultarFarmacias();
	void consultarMedicamentos();
}
