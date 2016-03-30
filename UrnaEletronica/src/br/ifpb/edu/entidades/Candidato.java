package br.ifpb.edu.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_candidato")
@DiscriminatorValue(value = "2")
@NamedQuery(name = "Candidato.getAll", query = "from Candidato")
public class Candidato extends Pessoa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_candidato")
	private Integer numero;
	
	@Column(name = "cargo_candidato")
	private String cargo;
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	
}
