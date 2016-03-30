package br.ifpb.edu.entidades;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_voto")
@NamedQuery(name = "Voto.getAll", query = "from Voto")
public class Voto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_voto")
	private Integer id;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_eleitor")
	private Eleitor eleitor;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_candidato")
	private Candidato candidato;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_urna")
	private UrnaEletronica urnaEletronica;
	
	@Column(name = "data")
	private Date data;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public UrnaEletronica getUrnaEletronica() {
		return urnaEletronica;
	}

	public void setUrnaEletronica(UrnaEletronica urnaEletronica) {
		this.urnaEletronica = urnaEletronica;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	

}
