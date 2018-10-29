package br.ufrpe.easy_school.negocios.beans;

import java.util.ArrayList;

import br.ufrpe.easy_school.auxiliares.Nota;

public class Aluno {

	private String nome;
	private String matricula;
	private String senha;
	public ArrayList<Nota> notas;
	
	
	
	
	public Aluno(String nome, String matricula, String senha) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.senha = senha;
		this.notas = new ArrayList<Nota>(11);
		this.criarNotas();
		
	}
	
	
	private String getSenha() {
		return senha;
	}


	private void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public void criarNotas() {
		this.notas.add(new Nota("Arte"));
		this.notas.add(new Nota("Biologia"));
		this.notas.add(new Nota("Ed. Física"));
		this.notas.add(new Nota("Filosofia"));
		this.notas.add(new Nota("Física"));
		this.notas.add(new Nota("Geografia"));
		this.notas.add(new Nota("História"));
		this.notas.add(new Nota("Inglês"));
		this.notas.add(new Nota("Português"));
		this.notas.add(new Nota("Química"));
		this.notas.add(new Nota("Matemática"));
	}

	//busca no arrayList de "Nota" pela disciplina com o nome passado como parametro e devolve a posição dela
	public int buscarPosDisciplina(String buscar) {
		for(int i = 0; i < this.notas.size(); i++) {
			if(this.notas.get(i).getDisciplina().equals(buscar)) {
				return i;
			}
		}
		return -1;
	}
	
	public void setNota(int posicao,int unidade, double nota) {
		this.notas.get(posicao).mudarNota(unidade, nota);
	}
	
	public String imprimirNotas() {
		String imprimir = "";
		for(int i = 0; i < 11; i++) {
			imprimir += this.notas.get(i).toString();
		}
		
		return imprimir;
	}
	
	
	
}
