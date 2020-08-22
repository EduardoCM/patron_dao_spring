package com.codigorupestre.boletos.model;

public class BoletoAvion {

	private int id;

	private String codigo;

	private String vuelo;

	private String nombre;

	private String Origen;

	private String Destino;

	private String Fecha;

	private String hora;

	private String asiento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getVuelo() {
		return vuelo;
	}

	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	@Override
	public String toString() {
		return "BoletoAvion [id=" + id + ", codigo=" + codigo + ", vuelo=" + vuelo + ", nombre=" + nombre + ", Origen="
				+ Origen + ", Destino=" + Destino + ", Fecha=" + Fecha + ", hora=" + hora + ", asiento=" + asiento
				+ "]";
	}

}
