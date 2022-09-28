package br.com.cravoecanela.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.cravoecanela.model.Pacote;
import br.com.cravoecanela.service.IPacoteService;

@RestController
@RequestMapping("pacotes")
@CrossOrigin(origins = "*")
public class PacoteController {
	
	@Autowired
	private IPacoteService service;
	
	//recuperar todos
	@GetMapping()
	public ArrayList<Pacote> recuperarTodos(){
			return service.recuperarTodos();	
			}

	@GetMapping("/{id}")
	public ResponseEntity<Pacote> recuperarPeloId(@PathVariable Long id){
		Pacote res = service.recuperarPeloId(id);
		if (res != null){
			return ResponseEntity.ok(service.recuperarPeloId(id));
		}
	 
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	 }
}
