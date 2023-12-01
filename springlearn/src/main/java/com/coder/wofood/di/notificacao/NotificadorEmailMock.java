package com.coder.wofood.di.notificacao;

import org.springframework.context.annotation.Profile;

import com.coder.wofood.di.modelo.Cliente;

public class NotificadorEmailMock implements Notificador {

	private Boolean caixaAlta;
	private String smtp;
	
	
	public NotificadorEmailMock(String smtp) {
		System.out.println("NotificadorEmail instanciado MOCK");
		this.smtp = smtp;
	}

	public void setCaixaAlta(Boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("chamando metodo notificar !!!! ");
		System.out.println("");
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("MOCK: SERIA NOTIFICADO  %s através do email e smtp %s e %s: %s \n", cliente.getNome(), cliente.getEmail(), this.smtp, mensagem);
	}

	
	
}
