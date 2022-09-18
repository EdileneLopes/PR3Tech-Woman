package br.com.cravoecanela.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cravoecanela.model.Cliente;
import br.com.cravoecanela.service.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService service;
	
	//recuperar todos
		@GetMapping("/clientes")
		public ArrayList<Cliente> recuperarTodos(){
			return service.recuperarTodos();	
			}
}
