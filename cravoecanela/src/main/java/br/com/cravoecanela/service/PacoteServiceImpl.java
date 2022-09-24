package br.com.cravoecanela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.dao.PacoteDAO;
import br.com.cravoecanela.model.Pacote;

@Service
public class PacoteServiceImpl implements IPacoteService{

	@Autowired
	private PacoteDAO dao;
	@Override
	public ArrayList<Pacote> recuperarTodos() {
		return (ArrayList<Pacote>)dao.findAll();
	}

	@Override
	public Pacote recuperarPeloId(Long id) {
		return dao.findById(id).orElse(null);
	}
}
