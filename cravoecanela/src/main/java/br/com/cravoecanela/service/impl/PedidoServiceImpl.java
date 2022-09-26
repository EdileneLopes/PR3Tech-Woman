package br.com.cravoecanela.service.impl;

import java.util.ArrayList;

import br.com.cravoecanela.service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.dao.PedidoDAO;
import br.com.cravoecanela.model.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private PedidoDAO dao;
	@Override
	public ArrayList<Pedido> recuperarTodos() {
		return (ArrayList<Pedido>)dao.findAll();
	}

	@Override
	public Pedido recuperarPeloId(Long id) {
		return dao.findById(id).orElse(null);
	}
}
