package br.com.cravoecanela.dao;



import br.com.cravoecanela.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
