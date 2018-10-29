package br.ufrpe.easy_school.negocios.beans;

public class Professor {
	
	private String nome;
	private String login;
	private String senha;
	private String disciplina;
	
	
	
	public Professor(String nome, String login, String senha, String disciplina) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.disciplina = disciplina;
	}



	//Pega a posicao da disciplina no arrayList de notas do aluno e muda a nota da unidade passada como parametro para a nota passada como parametro
	public void setNota(Aluno aluno, int unidade, double nota) {
		int aux = aluno.buscarPosDisciplina(disciplina);
		if(aux != -1) {
			aluno.setNota(aux, unidade, nota);
		}
		else {
			//mensagem de erro
		}
	}

}
