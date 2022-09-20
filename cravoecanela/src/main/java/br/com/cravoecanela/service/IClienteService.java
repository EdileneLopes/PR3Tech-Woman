package br.com.cravoecanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.model.Cliente;
import org.springframework.stereotype.Repository;


public interface IClienteService {
	public ArrayList<Cliente> recuperarTodos();
	public Cliente recuperarPeloId(Long id);
	public Cliente cadastrarNovo(Cliente novo);
	public void excluir (Long id);
	public Cliente atualizarDados (Cliente dados);

}
