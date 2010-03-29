package br.com.acervotcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.acervotcc.jdbc.ConnectionFactory;
import br.com.acervotcc.modelo.Autor;

public class AutorDao {

	private Connection connection;
	
	public AutorDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void inserir(Autor autor) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("insert into autor(autnome, autsobrenome) values (?,?)");
		
		pstm.setString(1, autor.getAutNome());
		pstm.setString(2, autor.getAutSobreNome());

		pstm.execute();
		
		pstm.close();
		
	}
	
	public List<Autor> listar() throws SQLException{
		
		List<Autor> autores = new ArrayList<Autor>();
		PreparedStatement pstm = connection.prepareStatement("select autid,autnome,autsobrenome from Autor");
		ResultSet rs = pstm.executeQuery();
		Autor c;
		
		while(rs.next()){
			
			c = new Autor();
			c.setAutId(rs.getInt(1));
			c.setAutNome(rs.getString(2));
			c.setAutSobreNome(rs.getString(3));
			autores.add(c);
		}
		
		pstm.close();
		rs.close();
		
		return autores;
	
	}
	
	public Autor pesquisar(int autid) throws SQLException{
		
		Autor autor = new Autor();
		PreparedStatement pstm = connection.prepareStatement("select autid,autnome,autsobrenome from Autor where autid = ?");
		pstm.setInt(1, autid);
		
		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			autor.setAutId(rs.getInt(1));
			autor.setAutNome(rs.getString(2));
			autor.setAutSobreNome(rs.getString(3));
		}
		
		rs.close();
		pstm.close();
		
		return autor;
		
	}
	
	public Autor pesquisarNome(String nome) throws SQLException{
		
		Autor autor = new Autor();
		PreparedStatement pstm = connection.prepareStatement("select autid,autnome, autsobrenome from Autor where autnome = ?");
		pstm.setString(1, nome);

		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			autor.setAutId(rs.getInt(1));
			autor.setAutNome(rs.getString(2));
			autor.setAutSobreNome(rs.getString(3));
		}
		
		rs.close();
		pstm.close();
		
		return autor;
		
	}
	
	public List<Autor> buscar(String s) throws SQLException{
		
		List<Autor> autores = new ArrayList<Autor>();
		String sql = "SELECT * FROM autor WHERE autnome like '"+ s +"%' OR autsobrenome like '%"+ s +"%'";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Autor autor;
		
		while(rs.next()){
			autor = new Autor();
			autor.setAutId(rs.getInt(1));
			autor.setAutNome(rs.getString(2));
			autor.setAutSobreNome(rs.getString(3));
			autores.add(autor);
		}
		
		return autores;
	}
	
	public void atualizar(Autor autor) throws SQLException{
		
		String sql = "UPDATE autor SET autnome = ?, autsobrenome = ? where autid = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, autor.getAutNome());
		ps.setString(2, autor.getAutSobreNome());
		ps.setInt(3, autor.getAutId());
		ps.execute();	
	}
	
	public void remover(Autor autor) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("DELETE FROM autor WHERE autid = ?");
		pstm.setInt(1, autor.getAutId());
		
		pstm.execute();
		pstm.close();
		
	}
	
	
}
