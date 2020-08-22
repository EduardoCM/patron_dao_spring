package com.codigorupestre.boletos.dao;

import java.util.List;

import com.codigorupestre.boletos.model.BoletoAvion;

public interface BoletosDAO {

	public void comprarBoleto(BoletoAvion boleto);
	
	public List<BoletoAvion> obtenerBoletosPorVuelo(String vuelo);
	
	public void cancelarBoleto(String codigo);
	
	public void buscarBoletoPorCodigo(String codigo);
	

}
