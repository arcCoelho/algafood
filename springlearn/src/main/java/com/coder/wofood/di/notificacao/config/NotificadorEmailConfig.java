package com.coder.wofood.di.notificacao.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coder.wofood.di.notificacao.NotificadorEmail;
import com.coder.wofood.di.notificacao.NotificadorEmailMock;


@Configuration
public class NotificadorEmailConfig {

	@Value("${notificador.email.host-servidor}")
	private String smtp;
	
	@TipoDeNotificacao(TipoEnvio.EMAIL)
	@Profile("prod")
	@Bean
	public NotificadorEmail notificadorEmail(){
		NotificadorEmail notificador = new NotificadorEmail(smtp);
		notificador.setCaixaAlta(Boolean.TRUE);
		
		return notificador;
	}

	@TipoDeNotificacao(TipoEnvio.EMAIL)
	@Profile("dev")
	@Bean
	public NotificadorEmailMock notificadorEmailMock(){
		NotificadorEmailMock notificador = new NotificadorEmailMock("smtp.TESTE.com");
		notificador.setCaixaAlta(Boolean.TRUE);
		
		return notificador;
	}
	
}
