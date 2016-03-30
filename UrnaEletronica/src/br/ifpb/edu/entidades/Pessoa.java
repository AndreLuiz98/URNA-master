package br.ifpb.edu.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
@NamedQuery(name = "Pessoa.getAll", query = "from Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tp_pessoa", discriminatorType = DiscriminatorType.INTEGER)
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")	
	private Integer identidade;

	@Column(name = "nome_pessoa")
	private String nome;

	@Column(name = "endereco_pessoa")
	private String endereco;

	@Column(name = "cpf_pessoa")
	private String cpf;

	@Column(name = "tituloVot_pessoa")
	private String tituloVotacao;
	
	@Column(name = "tp_pessoa", insertable = false, updatable = false)
    private String tipo;

	public Integer getIdentidade() {
		return identidade;
	}

	public void setIdentidade(Integer identidade) {
		this.identidade = identidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTituloVotacao() {
		return tituloVotacao;
	}

	public void setTituloVotacao(String tituloVotacao) {
		this.tituloVotacao = tituloVotacao;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
