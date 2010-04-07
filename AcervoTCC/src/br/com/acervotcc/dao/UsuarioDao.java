package br.com.acervotcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.acervotcc.jdbc.ConnectionFactory;
import br.com.acervotcc.modelo.Usuario;
import br.com.acervotcc.seguranca.Criptografia;

public class UsuarioDao {

	private Connection connection;
	
	public UsuarioDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void inserir(Usuario usuario) throws SQLException{
		
		PreparedStatement pstm = connection.prepareStatement("insert into usuario(usrlogin, usrsenha, usrnome, usrsobrenome, usremail) values (?,?,?,?,?)");
		
		pstm.setString(1, usuario.getUsrLogin());
		pstm.setString(2, Criptografia.criptografar(usuario.getUsrSenha()));
		pstm.setString(3, usuario.getUsrNome());
		pstm.setString(4, usuario.getUsrSobreNome());
		pstm.setString(5, usuario.getUsrEmail());

		pstm.execute();
		
		pstm.close();
		
	}
	
	public List<Usuario> listar() throws SQLException{
		List<Usuario> usuarios = new ArrayList<Usuario>();
		PreparedStatement pstm = connection.prepareStatement("SELECT usrid,usrlogin,usrsenha,usrnome,usrsobrenome,usremail,usrdatacad FROM usuario");
		ResultSet rs = pstm.executeQuery();
		Usuario usr;
		
		while(rs.next()){
			
			usr = new Usuario();
			usr.setUsrId(rs.getInt(1));
			usr.setUsrLogin(rs.getString(2));
			usr.setUsrSenha(rs.getString(3));
			usr.setUsrNome(rs.getString(4));
			usr.setUsrSobreNome(rs.getString(5));
			usr.setUsrEmail(rs.getString(6));
			usr.setUsrDataCad(rs.getDate(7));
			usuarios.add(usr);
		}
		pstm.close();
		rs.close();
		
		return usuarios;
	}
	
	public Usuario pesquisar(int usrid) throws SQLException{
		Usuario usuario = new Usuario();
		PreparedStatement pstm = connection.prepareStatement("SELECT usrid,usrlogin,usrsenha,usrnome,usrsobrenome,usremail,usrdatacad FROM usuario WHERE usrid = ?");
		pstm.setInt(1, usrid);
		
		ResultSet rs = pstm.executeQuery();
		if(rs.next()){
			usuario.setUsrId(rs.getInt(1));
			usuario.setUsrLogin(rs.getString(2));
			usuario.setUsrSenha(rs.getString(3));
			usuario.setUsrNome(rs.getString(4));
			usuario.setUsrSobreNome(rs.getString(5));
			usuario.setUsrEmail(rs.getString(6));
			usuario.setUsrDataCad(rs.getDate(7));
		}
		
		pstm.close();
		rs.close();
		
		return usuario;
	}
	
	public Usuario pesquisarNome(String nome)throws SQLException{
		
		Usuario usuario = new Usuario();
		PreparedStatement pstm = connection.prepareStatement("SELECT usrid,usrlogin,usrsenha,usrnome,usrsobrenome,usremail,usrdatacad FROM usuario WHERE usrnome = ?");
		pstm.setString(1, nome);
		
		ResultSet rs = pstm.executeQuery();
		if(rs.next()){
			usuario.setUsrId(rs.getInt(1));
			usuario.setUsrLogin(rs.getString(2));
			usuario.setUsrSenha(rs.getString(3));
			usuario.setUsrNome(rs.getString(4));
			usuario.setUsrSobreNome(rs.getString(5));
			usuario.setUsrEmail(rs.getString(6));
			usuario.setUsrDataCad(rs.getDate(7));
		}
		
		pstm.close();
		rs.close();
		
		return usuario;
	}

	public List<Usuario> buscar(String s) throws SQLException{
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "SELECT * FROM usuario WHERE usrnome like '"+ s +"%' OR usrsobrenome like '%"+ s +"%'";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Usuario usuario;
		
		while(rs.next()){
			usuario = new Usuario();
			usuario.setUsrId(rs.getInt(1));
			usuario.setUsrLogin(rs.getString(2));
			usuario.setUsrSenha(rs.getString(3));
			usuario.setUsrNome(rs.getString(4));
			usuario.setUsrSobreNome(rs.getString(5));
			usuario.setUsrEmail(rs.getString(6));
			usuario.setUsrDataCad(rs.getDate(7));
			usuarios.add(usuario);
		}
		
//		st.close();
//		rs.close();
		
		return usuarios;
	}
	
	public void atualizar(Usuario usuario) throws SQLException{
		
		String sql = "UPDATE usuario SET usrlogin = ?, usrsenha = ?, usrnome = ?, usrsobrenome = ?, usremail = ? WHERE usrid = ?";
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setString(1, usuario.getUsrLogin());
		pstm.setString(2, Criptografia.criptografar(usuario.getUsrSenha()));
		pstm.setString(3, usuario.getUsrNome());
		pstm.setString(4, usuario.getUsrSobreNome());
		pstm.setString(5, usuario.getUsrEmail());
		pstm.setInt(6, usuario.getUsrId());
		
		pstm.execute();
		
	}
	
	public void remover(Usuario usuario) throws SQLException{
		
		String sql = "DELETE FROM usuario WHERE usrid = ?";
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setInt(1, usuario.getUsrId());
		
		pstm.execute();
		pstm.close();
	}
	
}
