package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Usuario;
import view.ViewCadastraUsuario;
import view.ViewExibeListaUsuarios;

public class ControleUsuario {
	
	//Metodo construtor
	public ControleUsuario(){
		//Criar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Solicitar dados do usuario
		ViewCadastraUsuario vcu = new ViewCadastraUsuario();
		
		// Criar objeto usuario com os dados digitados
		Usuario usuario = new Usuario(vcu.getNome(), vcu.getMatricula(), vcu.getCurso());
		
		//Colocar o usuario na lista de usuarios
		bds.insereUsuario(usuario);
		
		//Recuperar a lista de usuarios
		ArrayList<Usuario> usuarios = bds.getUsuarios();
		
		//Criar uma string representando todos os usuarios da lista
		String s = "";
		for (int i = 0; i < usuarios.size(); i++) {
			s = s + "----------------\n" + usuarios.get(i);
		}
		
		//Exibir a lista de usuarios
		ViewExibeListaUsuarios velu = new ViewExibeListaUsuarios(s);
		
		
		
		
		
	}

}
