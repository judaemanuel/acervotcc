package br.com.acervotcc.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.acervotcc.dao.AutorDao;
import br.com.acervotcc.modelo.Autor;

public class TesteAutorDao {
	
	public static void main(String[] args) {

		// Testa inserir
//		Autor c = new Autor();
//		c.setAutId(3);
//		c.setAutNome("Ana Helena");
//		c.setAutSobreNome("Costa dos Santos");
//		
//		AutorDao dao;
//		try {
//			dao = new AutorDao();
//			dao.inserir(c);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa listar
//		try {
//			AutorDao dao = new AutorDao();
//			List<Autor> l = dao.listar();
//			for (Autor autor : l) {
//				System.out.println(autor.getAutId() + " - " + autor.getAutNome()+ " " + autor.getAutSobreNome());
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa Pesquisar
//		try {
//			AutorDao dao = new AutorDao();
//			Autor autor = dao.pesquisar(3);
//			System.out.println(autor.getAutId() + " - " + autor.getAutNome() + " " + autor.getAutSobreNome());
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
//			AutorDao dao = new AutorDao();
//			Autor autor = dao.pesquisarNome("João");
//			System.out.println(autor.getAutId() + " - " + autor.getAutNome() + " " + autor.getAutSobreNome());
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		// Testa atualizar
//		try {
//			AutorDao dao = new AutorDao();
//			Autor autor = dao.pesquisar(2);
//			autor.setAutNome("João");
//			autor.setAutSobreNome("Da Silva");
//			dao.atualizar(autor);
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Testa buscar
//		try {
//			AutorDao dao = new AutorDao();
//			List<Autor> autores = dao.buscar("Santos");
//			for (Autor autor : autores) {
//				System.out.println(autor.getAutId() + " - " + autor.getAutNome() + " " + autor.getAutSobreNome());
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
