package br.com.cravoecanela.dao;

import br.com.cravoecanela.model.Pacote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PacoteDAO extends JpaRepository<Pacote, Long> {

}
