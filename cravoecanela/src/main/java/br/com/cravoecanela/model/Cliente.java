package br.com.cravoecanela.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long idCliente;
	
	@Column(name = "nome", length = 60, nullable = true)
	private String nome;
	
	@Column(name = "email", length = 30, nullable = false)
	private String email;
	
	@Column(name = "senha", length = 15, nullable = true)
	private String senha;
	
	@Column(name = "cpf", length = 18, nullable = false)
	private String cpf;


	
	

	


}