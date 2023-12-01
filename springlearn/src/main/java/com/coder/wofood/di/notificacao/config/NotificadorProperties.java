package com.coder.wofood.di.notificacao.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "notificador.email")
public class NotificadorProperties {

	private String hostServidor;
	private String portaServidor;
	
	public String getHostServidor() {
		return hostServidor;
	}
	
	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}
	
	public String getPortaServidor() {
		return portaServidor;
	}
	
	public void setPortaServidor(String portaServidor) {
		this.portaServidor = portaServidor;
	}	
	
	
}
