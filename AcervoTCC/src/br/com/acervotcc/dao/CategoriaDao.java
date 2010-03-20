package br.com.acervotcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.acervotcc.jdbc.ConnectionFactory;
import br.com.acervotcc.modelo.Categoria;

public class CategoriaDao {

	private Connection connection;
	
	public CategoriaDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void inserir(Categoria categoria) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("insert into categoria(catnome) values (?)");
		
		pstm.setString(1, categoria.getCatNome());

		pstm.execute();
		
		pstm.close();
		
	}
	
	public List<Categoria> listar() throws SQLException{
		
		List<Categoria> Categorias = new ArrayList<Categoria>();
		PreparedStatement pstm = connection.prepareStatement("select catid,catnome from Categoria");
		ResultSet rs = pstm.executeQuery();
		Categoria c;
		
		while(rs.next()){
			
			c = new Categoria();
			c.setCatId(rs.getInt(1));
			c.setCatNome(rs.getString(2));
			Categorias.add(c);
		}
		
		pstm.close();
		rs.close();
		
		return Categorias;
	
	}
	
	public Categoria pesquisar(int catid) throws SQLException{
		
		Categoria Categoria = new Categoria();
		PreparedStatement pstm = connection.prepareStatement("select catid,catnome from Categoria where catid = ?");
		pstm.setInt(1, catid);
		
		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			Categoria.setCatId(rs.getInt(1));
			Categoria.setCatNome(rs.getString(2));
		}
		
		rs.close();
		pstm.close();
		
		return Categoria;
		
	}
	
	public Categoria pesquisarNome(String nome) throws SQLException{
		
		Categoria Categoria = new Categoria();
		PreparedStatement pstm = connection.prepareStatement("select catid,catnome from Categoria where catnome = ?");
		pstm.setString(1, nome);

		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			Categoria.setCatId(rs.getInt(1));
			Categoria.setCatNome(rs.getString(2));
		}
		
		rs.close();
		pstm.close();
		
		return Categoria;
		
	}
	
	public void remover(Categoria Categoria) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("DELETE FROM Categoria WHERE catid = ?");
		pstm.setInt(1, Categoria.getCatId());
		
		pstm.execute();
		pstm.close();
		
	}
	
	
}
