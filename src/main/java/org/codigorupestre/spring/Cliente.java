package org.codigorupestre.spring;

import java.util.logging.Logger;

public class Cliente {

	private final static Logger LOGGER = Logger.getLogger(Cliente.class.getName());

	private String nombre;

	private String email;
	
	private Tarjeta tarjeta;

	public Cliente() {

	}

	public Cliente(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}

	public void realizarPago() {
		LOGGER.info(nombre + "  Realizo pago con la tarjeta ");
		LOGGER.info("Numero de tarjeta: " + tarjeta.getNumero());
		LOGGER.info("Nombre del Banco: " + tarjeta.getBanco());		
		enviarNotificacionEmail();
	}
	
	private void enviarNotificacionEmail() {
		LOGGER.info("Notificacion de pago al email: " + email);
	}
	
	public void inicio() {
		LOGGER.info("INICIO DEL BEAN :::: CARGANDO RECURSOS");
	}
	
	public void finalizar() {
		LOGGER.info("FINALIZA EL BEAN :::: LIMPIANDO RECUERSOS");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
	

}
