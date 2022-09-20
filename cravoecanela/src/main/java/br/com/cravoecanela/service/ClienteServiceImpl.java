package br.com.cravoecanela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cravoecanela.dao.ClienteDAO;
import br.com.cravoecanela.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private ClienteDAO dao;
	@Override
	public ArrayList<Cliente> recuperarTodos() {
		return (ArrayList<Cliente>)dao.findAll();
	}

	@Override
	public Cliente recuperarPeloId(Long id) {

		return dao.findById(id).orElse(null);
	}
	@Override
	public Cliente cadastrarNovo(Cliente novo) {
		if (novo.getNome() != null){
			return dao.save(novo);
		}
			return null;
	}

	@Override
	public void excluir(Long id) {
		dao.deleteById(id);

	}

	@Override
	public Cliente atualizarDados(Cliente dados) {
		if (dados.getNome() != null && dados.getIdCliente() != null){
			return dao.save(dados);
		}
		return null;
	}

}
