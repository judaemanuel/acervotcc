package br.com.acervotcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public void remover(Curso curso) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("DELETE FROM curso WHERE curid = ?");
		pstm.setInt(1, curso.getCurId());
		
		pstm.execute();
		pstm.close();
		
	}
	
	
}
