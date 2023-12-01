package com.coder.wofood.di.notificacao;

import com.coder.wofood.di.modelo.Cliente;

public interface Notificador {

	public void notificar(Cliente cliente, String mensagem);
	
}