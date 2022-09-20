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
		// TODO Auto-generated method stub
		return (ArrayList<Cliente>)dao.findAll();
	}
	@Override
	public Cliente recuperarPeloId(Integer idCliente) {
		// TODO Auto-generated method stub
		return dao.findById(idCliente).orElse(null);
	}
	@Override
	public Cliente cadastrarNovo(Cliente novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

}
