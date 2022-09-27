package br.com.cravoecanela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cravoecanela.model.Pacote;
import br.com.cravoecanela.service.IPacoteService;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping()
public class PacoteController {
	
	@Autowired
	private IPacoteService service;

	@GetMapping("/pacotes")
	public ModelAndView listaPacotes(){
		ModelAndView mv = new ModelAndView("index");
		Iterable<Pacote> pacotes = service.recuperarTodos();
		mv.addObject("pacotes", pacotes);
		return mv;
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
