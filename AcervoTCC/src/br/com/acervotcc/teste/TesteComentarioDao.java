package br.com.acervotcc.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.acervotcc.dao.ComentarioDao;
import br.com.acervotcc.modelo.Comentario;

public class TesteComentarioDao {
	
	public static void main(String[] args) {

		// Testa inserir
//		Comentario c = new Comentario();
//		c.setComUsuarioId(1);
//		c.setComDescricao("relatório horrível, não podia ser pior.");
//
//		ComentarioDao dao;
//		try {
//			dao = new ComentarioDao();
//			dao.inserir(c);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa listar
//		try {
//			ComentarioDao dao = new ComentarioDao();
//			List<Comentario> l = dao.listar();
//			for (Comentario comentario : l) {
//				System.out.println(comentario.getComId() + " - " + "Usuario " + comentario.getComUsuarioId() + " - " + comentario.getComDescricao() + "- Data:" + comentario.getComData());
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa Pesquisar
//		try {
//			ComentarioDao dao = new ComentarioDao();
//			Comentario comentario = dao.pesquisar(1);
//			System.out.println(comentario.getComId() + " - " + ", usuario: " + comentario.getComUsuarioId() + ", " + comentario.getComDescricao() + ", " + comentario.getComData());
//		}catch (SQLException e){
//			e.printStackTrace();
//		}
		
		// Testa PesquisarUsuario "comentarios por usuario"
//		try {
//			ComentarioDao dao = new ComentarioDao();
//			Comentario comentario = dao.pesquisarUsuario(1);
//			System.out.println("Usuário " + comentario.getComId() + " comentou (on "+ comentario.getComData() +"):");
//			System.out.println(comentario.getComDescricao());
//		} catch (SQLException e){
//			e.printStackTrace();
//		}
		
		//Testa Atualizar
//			Comentario c = new Comentario();
//			c.setComDescricao("Até que foi bonzinho! nada mal.");
//			c.setComId(1);
//			
//			ComentarioDao dao;
//			try{
//				dao = new ComentarioDao();
//				dao.atualizar(c);
//			} catch(SQLException e){
//				e.printStackTrace();
//			}
		
		//Testa Remover
//		Comentario c = new Comentario();
//		c.setComId(5);
//		
//		ComentarioDao dao;
//		try{
//			dao = new ComentarioDao();
//			dao.remover(c);
//		} catch (SQLException e){
//			e.printStackTrace();
//		}
//		
	}
}

