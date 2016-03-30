package br.ifpb.edu.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_urna")
@NamedQuery(name = "UrnaEletronica.getAll", query = "from UrnaEletronica")
public class UrnaEletronica {
	
	@Column(name = "id_urna")
	private Integer id;
	
	@Column(name = "secao_urna")
	private String secao;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}
	
	
	
}
