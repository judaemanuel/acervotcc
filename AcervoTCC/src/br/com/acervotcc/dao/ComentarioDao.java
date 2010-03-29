package br.com.acervotcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.acervotcc.jdbc.ConnectionFactory;
import br.com.acervotcc.modelo.Comentario;

public class ComentarioDao {

	private Connection connection;
	
	public ComentarioDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void inserir(Comentario comentario) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("insert into comentario(comusuarioid, comdescricao) values (?,?)");
		
		pstm.setInt(1, comentario.getComUsuarioId());
		pstm.setString(2, comentario.getComDescricao());

		pstm.execute();
		
		pstm.close();
		
	}
	
	public List<Comentario> listar() throws SQLException{
		
		List<Comentario> comentarios = new ArrayList<Comentario>();
		PreparedStatement pstm = connection.prepareStatement("select comid,comusuarioid,comdescricao, comdata from comentario");
		ResultSet rs = pstm.executeQuery();
		Comentario c;
		
		while(rs.next()){
			
			c = new Comentario();
			c.setComId(rs.getInt(1));
			c.setComUsuarioId(rs.getInt(2));
			c.setComDescricao(rs.getString(3));
			c.setComData(rs.getDate(4));
			comentarios.add(c);
		}
		
		pstm.close();
		rs.close();
		
		return comentarios;
	
	}
	
	public Comentario pesquisar(int comid) throws SQLException{
		
		Comentario comentario = new Comentario();
		PreparedStatement pstm = connection.prepareStatement("select comid,comusuarioid,comdescricao,comdata from Comentario where comid = ?");
		pstm.setInt(1, comid);
		
		ResultSet rs = pstm.executeQuery();
		if (rs.next()){
			comentario.setComId(rs.getInt(1));
			comentario.setComUsuarioId(rs.getInt(2));
			comentario.setComDescricao(rs.getString(3));
			comentario.setComData(rs.getDate(4));
		}
		
		rs.close();
		pstm.close();
		
		return comentario;
		
	}
	
	public Comentario pesquisarUsuario(int usrid) throws SQLException{
		
		Comentario comentario = new Comentario();
		PreparedStatement pstm = connection.prepareStatement("select comid, comdescricao, comdata from comentario where comusuarioid = ?");
		pstm.setInt(1, usrid);
		
		ResultSet rs = pstm.executeQuery();
		if(rs.next()){
			comentario.setComId(rs.getInt(1));
			comentario.setComDescricao(rs.getString(2));
			comentario.setComData(rs.getDate(3));
		}
		rs.close();
		pstm.close();
		
		return comentario;
	}
	
	public void atualizar(Comentario comentario) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("UPDATE comentario SET comdescricao = ? where comid = ?");
		pstm.setString(1, comentario.getComDescricao());
		pstm.setInt(2, comentario.getComId());
		
		pstm.execute();
		pstm.close();
	}
	
	public void remover(Comentario comentario) throws SQLException{
		PreparedStatement pstm = connection.prepareStatement("DELETE FROM comentario WHERE comid = ?");
		pstm.setInt(1, comentario.getComId());
		
		pstm.execute();
		pstm.close();
	}	
}
