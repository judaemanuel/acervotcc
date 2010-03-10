package br.com.acervotcc.modelo;

import java.util.Date;

public class Usuario {
	
	private int usrId;
	private String usrLogin;
	private String usrSenha;
	private String usrNome;
	private String usrSobreNome;
	private String usrEmail;
	private Date usrDataCad;
	
	public int getUsrId() {
		return usrId;
	}
	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}
	public String getUsrLogin() {
		return usrLogin;
	}
	public void setUsrLogin(String usrLogin) {
		this.usrLogin = usrLogin;
	}
	public String getUsrSenha() {
		return usrSenha;
	}
	public void setUsrSenha(String usrSenha) {
		this.usrSenha = usrSenha;
	}
	public String getUsrNome() {
		return usrNome;
	}
	public void setUsrNome(String usrNome) {
		this.usrNome = usrNome;
	}
	public String getUsrSobreNome() {
		return usrSobreNome;
	}
	public void setUsrSobreNome(String usrSobreNome) {
		this.usrSobreNome = usrSobreNome;
	}
	public String getUsrEmail() {
		return usrEmail;
	}
	public void setUsrEmail(String usrEmail) {
		this.usrEmail = usrEmail;
	}
	public Date getUsrDataCad() {
		return usrDataCad;
	}
	public void setUsrDataCad(Date usrDataCad) {
		this.usrDataCad = usrDataCad;
	}

}
