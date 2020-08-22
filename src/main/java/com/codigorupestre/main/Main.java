package com.codigorupestre.main;

import com.codigorupestre.boletos.dao.BoletosDAO;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codigorupestre.boletos.dao.BoletoDAOImpl;
import com.codigorupestre.boletos.model.BoletoAvion;

public class Main {
	
	public static void main(String[] args) {	
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");			
		
		BoletosDAO boletosDAO = appContext.getBean(BoletoDAOImpl.class);		
		BoletoAvion boleto = appContext.getBean("boletoEduardo", BoletoAvion.class);	

		//boletosDAO.comprarBoleto(boleto);
		
		//boletosDAO.buscarBoletoPorCodigo("SPACENATIVE-3423412");
		
		/*
		 List<BoletoAvion> boletos = boletosDAO.obtenerBoletosPorVuelo("VUELO-5678");
		 System.out.println("::: Imprimer vuelos :::::");
		 for (BoletoAvion boletoAvion : boletos) {
			System.out.println(boletoAvion);
		}
		*/
		
		boletosDAO.cancelarBoleto("VUE123");
		
	}

}
