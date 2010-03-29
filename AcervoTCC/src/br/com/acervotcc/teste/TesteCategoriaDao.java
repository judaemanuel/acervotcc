package br.com.acervotcc.teste;

import java.sql.SQLException;
import java.util.List;
//import java.util.List;
import br.com.acervotcc.dao.CategoriaDao;
import br.com.acervotcc.modelo.Categoria;
import br.com.acervotcc.modelo.Curso;

public class TesteCategoriaDao {
	
	public static void main(String[] args) {

		//Test Insert
		Categoria c = new Categoria();
		c.setCatId(3);
		c.setCatNome("Solos e Nutrição de Plantas");
		
		CategoriaDao dao;
		try {
			dao = new CategoriaDao();
			dao.inserir(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
//		//Test List
//		try {
//		CategoriaDao dao = new CategoriaDao();
//		List<Categoria> l = dao.listar();
//		for (Categoria curso : l) {
//			System.out.println(curso.getCatId() + " - " + curso.getCatNome());
//		}
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}

		
//		//Test Research
//		try {
//		CategoriaDao dao = new CategoriaDao();
//		Categoria curso = dao.pesquisar(1);
//		System.out.println(curso.getCatId() + " - " + curso.getCatNome());
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}


		// Test Remove
//		try {
//			CategoriaDao dao = new CategoriaDao();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Test Name Research
//		try {
//			CategoriaDao dao = new CategoriaDao();
//			Categoria categoria = dao.pesquisarNome("Engenharia de Software");
//			System.out.println(categoria.getCatId() + " - " + categoria.getCatNome());
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		// Test Refresh
//		try {
//			CategoriaDao dao = new CategoriaDao();
//			Categoria categoria = dao.pesquisar(1);
//			categoria.setCatNome("Engenharia de Software");
//			dao.atualizar(categoria);
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// Testa buscar
//		try {
//			CategoriaDao dao = new CategoriaDao();
//			List<Categoria> categorias = dao.buscar("Eng");
//			for (Categoria categoria : categorias) {
//				System.out.println(categoria.getCatId() + " - " + categoria.getCatNome());
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
}
