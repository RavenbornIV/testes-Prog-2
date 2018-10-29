package br.ufrpe.easy_school.negocios.beans;

public class Diretoria {
	
	private String login;
	private String senha;
	
	
	public boolean login(String newLogin, String newSenha) {
		if(newLogin.equals(this.login) && newSenha.equals(this.senha)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean logout() {
		return true;
	}

}
