package br.com.cravoecanela.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pacote")
public class Pacote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pacote")
	private Long idPacote;

	@Column(name = "destino", length = 60, nullable = true)
	private String destino;
	
	@Column(name = "nome", length = 60, nullable = true)
	private String nome;
	
	@Column(name = "data_chekin", length = 60, nullable = true)
	private Date data_checkin;
	
	@Column(name = "data_chekout", length = 60, nullable = true)
	private Date data_checkout;
	
	@Column(name = "qtde_diarias")
	private Integer qtde_diarias;
	
	@Column(name = "link_foto", length = 255)
	private String linkFoto;
	
	@Column(name = "preco")
	private Double preco;

	
}
