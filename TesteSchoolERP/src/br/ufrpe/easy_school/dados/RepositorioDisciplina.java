package br.ufrpe.easy_school.dados;

import java.util.ArrayList;
import br.ufrpe.easy_school.negocios.beans.Disciplina;

public class RepositorioDisciplina {
	
	public ArrayList<Disciplina> disciplinas;
	
	
	public RepositorioDisciplina() {
		super();
		disciplinas = new ArrayList<Disciplina>(11);
		
	}


	public void gerarDisciplinas() { 
		this.disciplinas.add(new Disciplina("Arte", "0001"));
		this.disciplinas.add(new Disciplina("Biologia", "1001"));
		this.disciplinas.add(new Disciplina("Ed. Física", "0401"));
		this.disciplinas.add(new Disciplina("Filosofia", "0051"));
		this.disciplinas.add(new Disciplina("Física", "9001"));
		this.disciplinas.add(new Disciplina("Geografia", "0201"));
		this.disciplinas.add(new Disciplina("História", "0701"));
		this.disciplinas.add(new Disciplina("Inglês", "8001"));
		this.disciplinas.add(new Disciplina("Português", "0301"));
		this.disciplinas.add(new Disciplina("Química", "7001"));
		this.disciplinas.add(new Disciplina("Matemática", "6001"));
		
	}
	

}
