package com.codigorupestre.boletos.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.codigorupestre.boletos.mapper.BoletoAvionRowMapper;
import com.codigorupestre.boletos.model.BoletoAvion;
import com.codigorupestre.boletos.queryconstants.Query;

public class BoletoDAOImpl implements BoletosDAO {

	private Logger LOG = Logger.getLogger(BoletoDAOImpl.class.getName());

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void comprarBoleto(BoletoAvion boleto) {
		LOG.info("Se realiza compra de boleto " + boleto);
		jdbcTemplate.update(Query.QUERY, new Object[] {boleto.getCodigo(), boleto.getVuelo(), boleto.getNombre(), boleto.getOrigen(), boleto.getDestino(), boleto.getFecha(), boleto.getHora(), boleto.getDestino()});
	}

	public List<BoletoAvion> obtenerBoletosPorVuelo(String vuelo) {
		LOG.info("Se realiza consulta para obtener los boletos para el vuelo: " + vuelo);
		List<BoletoAvion> boletosParaVuelo = jdbcTemplate.query(Query.QUERY_VUELO, new Object[] {vuelo}, new BoletoAvionRowMapper());
		return boletosParaVuelo;
	}

	public void cancelarBoleto(String codigo) {
		LOG.info("Se realiza cancelacion de vuelo con el codigo: " + codigo);
		jdbcTemplate.update(Query.QUERY_CANCELAR_VUELO, codigo);
	}

	public void buscarBoletoPorCodigo(String codigo) {
		LOG.info("Se realiza consulta de boleto por codigo " + codigo);
		BoletoAvion boleto = jdbcTemplate.queryForObject(Query.QUERY_CODIGO, new Object[] {codigo}, new BoletoAvionRowMapper());
		System.out.println("Boleto Encontrado: " + boleto);
		
	}

	

}
