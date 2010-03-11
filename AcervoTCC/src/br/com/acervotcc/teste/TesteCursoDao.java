package br.com.acervotcc.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.acervotcc.dao.CursoDao;
import br.com.acervotcc.modelo.Curso;

public class TesteCursoDao {
	
	public static void main(String[] args) {

		// Testa inserir
		Curso c = new Curso();
		c.setCurId(3);
		c.setCurNome("Medicina");
		
		CursoDao dao;
		try {
			dao = new CursoDao();
			dao.inserir(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Testa listar
//		try {
//			CursoDao dao = new CursoDao();
//			List<Curso> l = dao.listar();
//			for (Curso curso : l) {
//				System.out.println(curso.getCurId() + " - " + curso.getCurNome());
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// Testa Pesquisar
//		try {
//			CursoDao dao = new CursoDao();
//			Curso curso = dao.pesquisar(1);
//			System.out.println(curso.getCurId() + " - " + curso.getCurNome());
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
		
		
		
	}
}
