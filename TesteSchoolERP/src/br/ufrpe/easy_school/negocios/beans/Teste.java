package br.ufrpe.easy_school.negocios.beans;

import java.util.ArrayList;

import br.ufrpe.easy_school.dados.RepositorioDisciplina;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Paulo", "10045", "4578");
		Aluno aluno2 = new Aluno("Henrique", "80045", "45478");
		Aluno aluno3 = new Aluno("Nascimento", "90045", "47578");
		Aluno aluno4 = new Aluno("Cavalcanti", "50045", "45978");
		Aluno aluno5 = new Aluno("Amorim", "30045", "45780");
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>(5);
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5);
		
		RepositorioDisciplina repoDisc = new RepositorioDisciplina();
		repoDisc.gerarDisciplinas();
		
		
		Turma turmaTeste = new Turma("001", repoDisc.disciplinas, alunos);
		
		
		Professor professorTeste = new Professor("Joao", "joao123", "senha", "Arte");
		
		professorTeste.setNota(alunos.get(0), 0, 9.5);
		
		System.out.println(alunos.get(0).imprimirNotas());
		
		professorTeste.setNota(turmaTeste.acessarAluno(turmaTeste.buscarAluno("Henrique")), 1, 5);
		
		System.out.println(alunos.get(1).imprimirNotas());

	}
	
	

}
