package com.codigorupestre.boletos.queryconstants;

public class Query {
	
	public static final String  QUERY = "INSERT INTO boleto_avion (codigo, vuelo, nombre, origen, destino, fecha, hora, asiento) values (?,?,?, ?, ?, ?, ?, ?)";
	
	public static final String QUERY_CODIGO = "SELECT id_boleto, codigo, vuelo, nombre, origen, destino, fecha, hora, asiento FROM boleto_avion WHERE codigo = ? ";
	
	public static final String QUERY_VUELO = "SELECT id_boleto, codigo, vuelo, nombre, origen, destino, fecha, hora, asiento FROM boleto_avion WHERE vuelo = ? ";
	
	public static final String QUERY_CANCELAR_VUELO = "DELETE FROM boleto_avion WHERE codigo = ?";

}
