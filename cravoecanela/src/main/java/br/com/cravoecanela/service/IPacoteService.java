package br.com.cravoecanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.model.Pacote;

public interface IPacoteService {
	
	public ArrayList<Pacote> recuperarTodos();
	public Pacote recuperarPeloId(Long id);
	

}
