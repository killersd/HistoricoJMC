package br.com.historico.historico;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNOS")
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod;
	private String nome;
	private String nome_pai;
	private String nome_mae;
	private String data_nasc;
	private String anostring;

	public long getCod() {
		return cod;
	}

	public String getNome_pai() {
		return nome_pai;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public String getAnostring() {
		return anostring;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}

	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public void setAnostring(String anostring) {
		this.anostring = anostring;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
