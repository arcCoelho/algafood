package com.coder.wofood.di.service.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coder.wofood.di.notificacao.Notificador;
import com.coder.wofood.di.notificacao.config.TipoDeNotificacao;
import com.coder.wofood.di.notificacao.config.TipoEnvio;
import com.coder.wofood.di.service.AtivacaoClienteService;

@Configuration
public class AtivacaoClienteServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(@TipoDeNotificacao(TipoEnvio.EMAIL) Notificador notificador) {
		AtivacaoClienteService ativacao = new AtivacaoClienteService();
		return ativacao;
	}
	
}
