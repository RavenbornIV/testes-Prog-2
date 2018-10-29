package br.ufrpe.easy_school.negocios.beans;

import java.util.ArrayList;

public class Turma {
	
	private String id;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<Aluno> alunos;
	
	
	public Turma(String id, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos) {
		super();
		this.id = id;
		this.alunos = new ArrayList<Aluno>(alunos);
		this.disciplinas = new ArrayList<Disciplina>(disciplinas);
		
		
	}
	
	public String imprimirAlunos() {
		String imprimir = "";
		
		for(int i = 0; i < alunos.size(); i++) {
			imprimir += alunos.get(i).getNome() + "\n";
		}
		
		return imprimir;
		
	}
	
	public int buscarAluno(String nomeAluno) {
		for(int i = 0; i < alunos.size(); i++) {
			if(nomeAluno.equals(alunos.get(i).getNome())) {
				return i;
			}
		}
		return -1;
	}
	
	public Aluno acessarAluno(int posicao) {
		return this.alunos.get(posicao);
	}
	
	

}
