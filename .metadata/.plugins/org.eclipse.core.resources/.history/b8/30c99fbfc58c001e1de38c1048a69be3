package com.coder.wofood.di.listner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.coder.wofood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotafiscalService {

	@EventListener
	public void clienteAtivadoListner(ClienteAtivadoEvent event) {
		System.out.println("emitindo nota fiscal para o cliente: "+event.getCliente().getNome());
	}
	
}
