package br.com.cravoecanela.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cravoecanela.model.Pedido;
import br.com.cravoecanela.service.IPedidoService;

@RestController
@RequestMapping("pedidos")
public class PedidoController {
	
	@Autowired
	private IPedidoService service;
	
	//recuperar todos
	@GetMapping()
	public ArrayList<Pedido> recuperarTodos(){
			return service.recuperarTodos();	
			}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> recuperarPeloId(@PathVariable Long id){
		Pedido res = service.recuperarPeloId(id);
		if (res != null){
			return ResponseEntity.ok(service.recuperarPeloId(id));
		}
	 
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	 }
}
