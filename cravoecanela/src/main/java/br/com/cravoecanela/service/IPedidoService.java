package br.com.cravoecanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.model.Pedido;

public interface IPedidoService {
	
	public ArrayList<Pedido> recuperarTodos();
	public Pedido recuperarPeloId(Long id);
	

}
