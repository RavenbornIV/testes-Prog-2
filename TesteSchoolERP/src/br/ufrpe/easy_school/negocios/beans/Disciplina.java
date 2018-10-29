package br.ufrpe.easy_school.negocios.beans;

public class Disciplina {
	
	private String nome;
	private String id;
	
	
	public Disciplina(String nome, String id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
