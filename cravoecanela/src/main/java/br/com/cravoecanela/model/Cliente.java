package br.com.cravoecanela.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.http.ResponseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "cnpj", length = 14, nullable = false)
	private String cnpj;
	
	@Column(name = "email", length = 14, nullable = false)
	private String email;
	
	@Column(name = "nome", length = 60, nullable = true)
	private String nome;
	
	@Column(name = "telefone", length = 20, nullable = true)
	private String telefone;

	


}