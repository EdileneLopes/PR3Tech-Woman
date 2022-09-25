package br.com.cravoecanela.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cravoecanela.model.Pedido;

@Repository
public interface PedidoDAO extends JpaRepository<Pedido, Long> {

}
