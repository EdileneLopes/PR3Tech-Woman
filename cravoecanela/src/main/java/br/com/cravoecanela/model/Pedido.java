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
@Table(name = "pedido")
public class Pedido{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long idPedido;
	
	@Column(name = "status", length = 10, nullable = true)
	private String staus;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "valor")
	private Double valor;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("pedido")
	private List<OrdemPedido> pedidos;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	
}