package br.ifpb.edu.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_apuracao")
@NamedQuery(name = "Apuracao.getAll", query = "from Apuracao")
public class Apuracao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_apuracao")
	private Integer id;
	
	@Column(name = "quantidade_votos")
	private Integer QuantidadeVotos;
	
	@Column(name = "votos_brancos")
	private Integer votosBrancos;
	
	@Column(name = "votos_nulos")
	private Integer votosNulos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidadeVotos() {
		return QuantidadeVotos;
	}

	public void setQuantidadeVotos(Integer quantidadeVotos) {
		QuantidadeVotos = quantidadeVotos;
	}

	public Integer getVotosBrancos() {
		return votosBrancos;
	}

	public void setVotosBrancos(Integer votosBrancos) {
		this.votosBrancos = votosBrancos;
	}

	public Integer getVotosNulos() {
		return votosNulos;
	}

	public void setVotosNulos(Integer votosNulos) {
		this.votosNulos = votosNulos;
	}
	
	
}
