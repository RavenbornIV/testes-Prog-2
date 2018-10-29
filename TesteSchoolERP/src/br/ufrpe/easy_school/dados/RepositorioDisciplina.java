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
		this.disciplinas.add(new Disciplina("Ed. F�sica", "0401"));
		this.disciplinas.add(new Disciplina("Filosofia", "0051"));
		this.disciplinas.add(new Disciplina("F�sica", "9001"));
		this.disciplinas.add(new Disciplina("Geografia", "0201"));
		this.disciplinas.add(new Disciplina("Hist�ria", "0701"));
		this.disciplinas.add(new Disciplina("Ingl�s", "8001"));
		this.disciplinas.add(new Disciplina("Portugu�s", "0301"));
		this.disciplinas.add(new Disciplina("Qu�mica", "7001"));
		this.disciplinas.add(new Disciplina("Matem�tica", "6001"));
		
	}
	

}
