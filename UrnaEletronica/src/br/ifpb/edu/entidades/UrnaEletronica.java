package br.ifpb.edu.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_urna")
public class UrnaEletronica {
	
	@Column(name = "id_eleitor")
	private Integer id;
	
	
	
}
