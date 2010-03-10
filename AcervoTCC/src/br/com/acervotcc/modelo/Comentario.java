package br.com.acervotcc.modelo;

import java.util.Date;

public class Comentario {
	
	private int comId;
	private int comUsuarioId;
	private String comDescricao;
	private Date comData;
	public int getComId() {
		return comId;
	}
	public void setComId(int comId) {
		this.comId = comId;
	}
	public int getComUsuarioId() {
		return comUsuarioId;
	}
	public void setComUsuarioId(int comUsuarioId) {
		this.comUsuarioId = comUsuarioId;
	}
	public String getComDescricao() {
		return comDescricao;
	}
	public void setComDescricao(String comDescricao) {
		this.comDescricao = comDescricao;
	}
	public Date getComData() {
		return comData;
	}
	public void setComData(Date comData) {
		this.comData = comData;
	}
	
	
}
