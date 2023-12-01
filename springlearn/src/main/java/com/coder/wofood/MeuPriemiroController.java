package com.coder.wofood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coder.wofood.di.modelo.Cliente;
import com.coder.wofood.di.service.AtivacaoClienteService;

@Controller
public class MeuPriemiroController {

	private AtivacaoClienteService ativacao;

	public MeuPriemiroController(AtivacaoClienteService ativacao) {
		this.ativacao = ativacao;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String teste() {
		Cliente c = new Cliente("Allan", "f@f.com", "(21)96994-7485"); 
		System.out.println("teste --");
		this.ativacao.ativar(c);
		
		return "hello world";
	}
	
}
