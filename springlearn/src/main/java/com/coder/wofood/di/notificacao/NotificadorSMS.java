package com.coder.wofood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.coder.wofood.di.modelo.Cliente;
import com.coder.wofood.di.notificacao.config.TipoDeNotificacao;
import com.coder.wofood.di.notificacao.config.TipoEnvio;

@TipoDeNotificacao(TipoEnvio.SMS)
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS pelo telefone %s mensagem:\n %s", 
				cliente.getNome(), cliente.getTelefone(), mensagem);

	}

}
