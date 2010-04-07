package br.com.acervotcc.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.acervotcc.dao.UsuarioDao;
import br.com.acervotcc.modelo.Usuario;

public class TesteUsuarioDao {
	
	public static void main(String[] args) {

		// Testa inserir
//		Usuario u = new Usuario();
//		u.setUsrLogin("teste3");
//		u.setUsrSenha("teste3");
//		u.setUsrNome("teste3");
//		u.setUsrSobreNome("sobrenome de teste3");
//		u.setUsrEmail("teste3@gmail.com");
//
//		UsuarioDao dao;
//		try {
//			dao = new UsuarioDao();
//			dao.inserir(u);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa listar
//		try {
//			UsuarioDao dao = new UsuarioDao();
//			List<Usuario> l = dao.listar();
//			for (Usuario usuario : l) {
//				System.out.println(usuario.getUsrId() + " - " + usuario.getUsrLogin() + " " + usuario.getUsrSenha());
//				System.out.println(usuario.getUsrNome() + " " + usuario.getUsrSobreNome());
//				System.out.println("Cadastrado desde:" + usuario.getUsrDataCad());
//				System.out.println("\n");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa Pesquisar
//		try {
//			UsuarioDao dao = new UsuarioDao();
//			Usuario usuario = dao.pesquisar(1);
//			System.out.println(usuario.getUsrId() + " - " + usuario.getUsrLogin() + ", " +  usuario.getUsrSenha() + ", " +  usuario.getUsrNome() + " " +  usuario.getUsrSobreNome() + ", " +  usuario.getUsrEmail() + ", (on " + usuario.getUsrDataCad() + ")");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa Remover
//		try {
//			CursoDao dao = new CursoDao();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		//Testa PesquisarNome
//		try {
//			UsuarioDao dao = new UsuarioDao();
//			Usuario usuario = dao.pesquisarNome("Juda");
//			System.out.println(usuario.getUsrId() + " - " + usuario.getUsrLogin() + ", " +  usuario.getUsrSenha() + ", " +  usuario.getUsrNome() + " " +  usuario.getUsrSobreNome() + ", " +  usuario.getUsrEmail() + ", (on " + usuario.getUsrDataCad() + ")");
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		// Testa atualizar
//		Usuario usr = new Usuario();
//		usr.setUsrLogin("test7");
//		usr.setUsrSenha("test5123");
//		usr.setUsrNome("test7");
//		usr.setUsrSobreNome("de Jesus Aquino");
//		usr.setUsrEmail("test5_@gmail.com");
//		usr.setUsrId(4);
//		
//		UsuarioDao dao;
//		try{
//			dao = new UsuarioDao();
//			dao.atualizar(usr);
//		} catch(SQLException e){
//			e.printStackTrace();
//		}
		
		//Testar Remover
//		Usuario usr = new Usuario();
//		usr.setUsrId(4);
//		
//		UsuarioDao dao;
//		try{
//			dao = new UsuarioDao();
//			dao.remover(usr);
//		} catch(SQLException e){
//			e.printStackTrace();
//		}
		
		// Testa buscar
//		try {
//			UsuarioDao dao = new UsuarioDao();
//			List<Usuario> usuarios = dao.buscar("s");
//			for (Usuario usuario : usuarios) {
//				System.out.println(usuario.getUsrId() + " - " + usuario.getUsrLogin() + ", " +  usuario.getUsrSenha() + ", " +  usuario.getUsrNome() + " " +  usuario.getUsrSobreNome() + ", " +  usuario.getUsrEmail() + ", (on " + usuario.getUsrDataCad() + ")");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
