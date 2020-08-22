package com.codigorupestre.boletos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codigorupestre.boletos.model.BoletoAvion;

public class BoletoAvionRowMapper implements RowMapper<BoletoAvion> {

	public BoletoAvion mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BoletoAvion boleto = new BoletoAvion();
		boleto.setId(rs.getInt("id_boleto"));
		boleto.setCodigo(rs.getString("codigo"));
		boleto.setVuelo(rs.getString("vuelo"));
		boleto.setNombre(rs.getString("nombre"));
		boleto.setOrigen(rs.getString("origen"));
		boleto.setDestino(rs.getString("destino"));
		boleto.setFecha(rs.getString("fecha"));
		boleto.setHora(rs.getString("hora"));
		boleto.setAsiento(rs.getString("hora"));
	
		return boleto;
	}
	
	
	
	
	

}
