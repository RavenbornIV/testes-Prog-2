package br.ufrpe.easy_school.auxiliares;

//classe auxiliar para notas do aluno
public class Nota {
	
	private String disciplina;
	private double[] notas;
	
	public void mudarNota(int unidade, double nota) {
		this.notas[unidade] = nota;
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}

	public Nota(String disciplina) {
		super();
		this.disciplina = disciplina;
		this.notas = new double[4];
		this.notas[0] = 0;
		this.notas[1] = 0;
		this.notas[2] = 0;
		this.notas[3] = 0;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		String imprimir = this.disciplina;
		imprimir += "|";
		imprimir += "  ";
		for(int i = 0; i < 4; i++) {
			
			imprimir += "Unidade ";
			imprimir += i + 1;
			imprimir += ": ";
			imprimir += this.notas[i];
			imprimir += "|";
			imprimir += "    ";
		}
		imprimir += "\n";
		return imprimir;
		
	}
	
	
	
	

}
