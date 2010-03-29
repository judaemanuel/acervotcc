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
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		PreparedStatement pstm = connection.prepareStatement("select catid,catnome from Categoria");
		ResultSet rs = pstm.executeQuery();
		Categoria c;
		
		while(rs.next()){
			
			c = new Categoria();
			c.setCatId(rs.getInt(1));
			c.setCatNome(rs.getString(2));
			categorias.add(c);
		}
		
		pstm.close();
		rs.close();
		
		return categorias;
	
	}
	
	public Categoria pesquisar(int catid) throws SQLException{
		
		Categoria categoria = new Categoria();
		PreparedStatement pstm = connection.prepareStatement("select catid,catnome from Categoria where catid = ?");
		pstm.setInt(1, catid);
		
		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			categoria.setCatId(rs.getInt(1));
			categoria.setCatNome(rs.getString(2));
		}
		
		rs.close();
		pstm.close();
		
		return categoria;
		
	}
	
	public Categoria pesquisarNome(String nome) throws SQLException{
		
		Categoria categoria = new Categoria();
		PreparedStatement pstm = connection.prepareStatement("select catid,catnome from Categoria where catnome = ?");
		pstm.setString(1, nome);

		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			categoria.setCatId(rs.getInt(1));
			categoria.setCatNome(rs.getString(2));
		}
		
		rs.close();
		pstm.close();
		
		return categoria;
		
	}
	
	public List<Categoria> buscar(String s) throws SQLException{
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		String sql = "SELECT * FROM categoria WHERE catnome like '"+ s +"%'";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Categoria categoria;
		
		while(rs.next()){
			categoria = new Categoria();
			categoria.setCatId(rs.getInt(1));
			categoria.setCatNome(rs.getString(2));
			categorias.add(categoria);
		}
		
		return categorias;
	}
	
	public void atualizar(Categoria categoria) throws SQLException{
		
		String sql = "UPDATE categoria SET catnome = ? where catid = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, categoria.getCatNome());
		ps.setInt(2, categoria.getCatId());
		ps.execute();	
	}
	
	public void remover(Categoria categoria) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("DELETE FROM Categoria WHERE catid = ?");
		pstm.setInt(1, categoria.getCatId());
		
		pstm.execute();
		pstm.close();
		
	}
	
	
}
