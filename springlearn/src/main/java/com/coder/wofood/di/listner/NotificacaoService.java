package com.coder.wofood.di.listner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.coder.wofood.di.notificacao.Notificador;
import com.coder.wofood.di.notificacao.config.TipoDeNotificacao;
import com.coder.wofood.di.notificacao.config.TipoEnvio;
import com.coder.wofood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@Autowired
	@TipoDeNotificacao(TipoEnvio.EMAIL)
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListner(ClienteAtivadoEvent clienteAtivadoEvent) {
		notificador.notificar(clienteAtivadoEvent.getCliente(), "cliente notificado da ativação!");
	}
	
}
