package br.com.acervotcc.teste;

import java.sql.SQLException;

import br.com.acervotcc.dao.CategoriaDao;
import br.com.acervotcc.modelo.Categoria;

public class TesteCategoriaDao {
	
	public static void main(String[] args) {

		//Test Insert
		Categoria c = new Categoria();
		c.setCatId(3);
		c.setCatNome("Engenharia de Software");
		
		CategoriaDao dao;
		try {
			dao = new CategoriaDao();
			dao.inserir(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
}
