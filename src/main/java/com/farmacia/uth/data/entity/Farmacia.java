package com.farmacia.uth.data.entity;


public class Farmacia {

	private int id;
    private String nombre_farm;
    private String descripcion_farm;
    private String direccion_farm;
    private String correo_farm;
    private String telefono_farm;
    private String usuario;
    private String fecha_creacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_farm() {
		return nombre_farm;
	}
	public void setNombre_farm(String nombre_farm) {
		this.nombre_farm = nombre_farm;
	}
	public String getDescripcion_farm() {
		return descripcion_farm;
	}
	public void setDescripcion_farm(String descripcion_farm) {
		this.descripcion_farm = descripcion_farm;
	}
	public String getDireccion_farm() {
		return direccion_farm;
	}
	public void setDireccion_farm(String direccion_farm) {
		this.direccion_farm = direccion_farm;
	}
	public String getCorreo_farm() {
		return correo_farm;
	}
	public void setCorreo_farm(String correo_farm) {
		this.correo_farm = correo_farm;
	}
	public String getTelefono_farm() {
		return telefono_farm;
	}
	public void setTelefono_farm(String telefono_farm) {
		this.telefono_farm = telefono_farm;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	

}
