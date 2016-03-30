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
@Table(name = "tb_eleitor")
@DiscriminatorValue(value = "1")
@NamedQuery(name = "Eleitor.getAll", query = "from Eleitor")
public class Eleitor extends Pessoa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_eleitor")
	private Integer rg;
	
	@Column(name = "secao_eleitor")
	private String secao;

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}
	
}
