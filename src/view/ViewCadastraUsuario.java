package view;

import javax.swing.JOptionPane;

public class ViewCadastraUsuario {
	//Atributos
	private String nome;
	private String matricula;
	private String curso;
	
	
	//Metodo construtor
	public ViewCadastraUsuario(){
		//Solicitar o nome
		this.nome = JOptionPane.showInputDialog("Digite o nome do usu�rio:");
		
		//Solicitar a matricula
		this.matricula = JOptionPane.showInputDialog("Digite a matr�cula do usu�rio:");
		
		//Solicitar o curso
		this.curso = JOptionPane.showInputDialog("Digite o curso do usu�rio:");
	}


	public String getNome() {
		return nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getCurso() {
		return curso;
	}
	
	

}
