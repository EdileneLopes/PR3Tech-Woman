package br.com.cravoecanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.model.Cliente;
import org.springframework.stereotype.Repository;


public interface IClienteService {
	public ArrayList<Cliente> recuperarTodos();
	public Cliente recuperarPeloId(Integer idCliente);
	public Cliente cadastrarNovo(Cliente novo);

}
