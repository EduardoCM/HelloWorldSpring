package org.codigorupestre.spring;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpring {
	
 private final static Logger LOGGER = Logger.getLogger(HelloWorldSpring.class.getName());
	
	public static void main(String[] args) {
		LOGGER.info(":::: Inicio de Contexto ::::");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Cliente cliente = null;
		
		// Obtener Bean con ID y casting
		//cliente = (Cliente) appContext.getBean("pago");
		
		//Obtener Bean con ID y tipo
		//cliente = appContext.getBean("pago", Cliente.class);
		
		cliente = appContext.getBean(Cliente.class);
		
		cliente.realizarPago();
		
		((ClassPathXmlApplicationContext)appContext).close();
		LOGGER.info(":::: Finaliza contexto");
	}
}
