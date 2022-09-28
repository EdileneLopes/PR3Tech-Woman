package br.com.cravoecanela.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.cravoecanela.model.Cliente;
import br.com.cravoecanela.service.IClienteService;

@RestController
@RequestMapping("clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

	@Autowired
	private IClienteService service;
	
	//recuperar todos
	@GetMapping()
	public ArrayList<Cliente> recuperarTodos(){
			return service.recuperarTodos();	
			}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> recuperarPeloId(@PathVariable Long id){
		Cliente res = service.recuperarPeloId(id);
		if (res != null){
			return ResponseEntity.ok(service.recuperarPeloId(id));
		}
	 
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	 }

	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> cadastrarNovo(@RequestBody Cliente novo){
	Cliente res = service.cadastrarNovo(novo);
	if (res != null){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarNovo(novo));
	}
	return ResponseEntity.badRequest().build();
	}

	@PutMapping()
	public ResponseEntity<Cliente> atualizarDados (@RequestBody Cliente dados){
		Cliente res = service.atualizarDados(dados);
		if (res != null){
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> excluir(@PathVariable Long id){
		service.excluir(id);
		return ResponseEntity.ok().build();
	}

}
