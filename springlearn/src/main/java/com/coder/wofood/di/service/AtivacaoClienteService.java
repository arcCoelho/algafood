package com.coder.wofood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.coder.wofood.di.modelo.Cliente;
import com.coder.wofood.di.notificacao.Notificador;
import com.coder.wofood.di.notificacao.NotificadorEmail;


public class AtivacaoClienteService {

	
	//private Notificador notificador;
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	
//	public AtivacaoClienteService(@Qualifier("email") Notificador notificador) {
//		this.notificador = notificador;
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
	
}
