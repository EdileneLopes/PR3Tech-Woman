package br.com.cravoecanela.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.cravoecanela.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer>{

}
