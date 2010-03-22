package br.com.acervotcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.acervotcc.jdbc.ConnectionFactory;
import br.com.acervotcc.modelo.Curso;

public class CursoDao {

	private Connection connection;
	
	public CursoDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void inserir(Curso curso) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("insert into curso(curnome) values (?)");
		
		pstm.setString(1, curso.getCurNome());
		
		pstm.execute();
		
		pstm.close();
		
	}
	
	public List<Curso> listar() throws SQLException{
		
		List<Curso> cursos = new ArrayList<Curso>();
		PreparedStatement pstm = connection.prepareStatement("select curid,curnome from curso");
		ResultSet rs = pstm.executeQuery();
		Curso c;
		
		while(rs.next()){
			
			c = new Curso();
			c.setCurId(rs.getInt(1));
			c.setCurNome(rs.getString(2));
			cursos.add(c);
		}
		
		pstm.close();
		rs.close();
		
		return cursos;
	
	}
	
	public Curso pesquisar(int curid) throws SQLException{
		
		Curso curso = new Curso();
		PreparedStatement pstm = connection.prepareStatement("select curid,curnome from curso where curid = ?");
		pstm.setInt(1, curid);
		
		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			curso.setCurId(rs.getInt(1));
			curso.setCurNome(rs.getString(2));
		}
		
		rs.close();
		pstm.close();
		
		return curso;
		
	}
	
	
	
	public Curso pesquisarNome(String nome) throws SQLException{
		
		Curso curso = new Curso();
		PreparedStatement pstm = connection.prepareStatement("select curid,curnome from curso where curnome = ?");
		pstm.setString(1, nome);

		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			curso.setCurId(rs.getInt(1));
			curso.setCurNome(rs.getString(2));
		}
		
		rs.close();
		pstm.close();
		
		return curso;
		
	}
	
	public List<Curso> buscar(String s) throws SQLException{
		
		List<Curso> cursos = new ArrayList<Curso>();
		String sql = "SELECT * FROM curso WHERE curnome like '"+ s +"%'";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Curso curso;
		
		while(rs.next()){
			curso = new Curso();
			curso.setCurId(rs.getInt(1));
			curso.setCurNome(rs.getString(2));
			cursos.add(curso);
		}
		
		return cursos;
	}
	
	public void atualizar(Curso curso) throws SQLException{
		
		String sql = "UPDATE curso SET curnome = ? where curid = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, curso.getCurNome());
		ps.setInt(2, curso.getCurId());
		ps.execute();	
	}
	
	public void remover(Curso curso) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("DELETE FROM curso WHERE curid = ?");
		pstm.setInt(1, curso.getCurId());
		
		pstm.execute();
		pstm.close();
		
	}
	
	
}
