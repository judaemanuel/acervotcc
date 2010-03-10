package br.com.acervotcc.modelo;

import java.util.Date;

public class Tcc {

	private int tccId;
	private int tccUsuarioId;
	private int tccCategoriaId;
	private int tccAutorId;
	private int tccComentarioId;
	private int tccCursoId;
	private String tccResumo;
	private String tccTitulo;
	private String tccPalavrasChaves;
	private byte tccArquivo;
	private double tccNota;
	private Date tccData;
	private Date tccDataCad;
	
	public Date getTccDataCad() {
		return tccDataCad;
	}
	public void setTccDataCad(Date tccDataCad) {
		this.tccDataCad = tccDataCad;
	}
	public int getTccId() {
		return tccId;
	}
	public void setTccId(int tccId) {
		this.tccId = tccId;
	}
	public int getTccUsuarioId() {
		return tccUsuarioId;
	}
	public void setTccUsuarioId(int tccUsuarioId) {
		this.tccUsuarioId = tccUsuarioId;
	}
	public int getTccCategoriaId() {
		return tccCategoriaId;
	}
	public void setTccCategoriaId(int tccCategoriaId) {
		this.tccCategoriaId = tccCategoriaId;
	}
	public int getTccAutorId() {
		return tccAutorId;
	}
	public void setTccAutorId(int tccAutorId) {
		this.tccAutorId = tccAutorId;
	}
	public int getTccComentarioId() {
		return tccComentarioId;
	}
	public void setTccComentarioId(int tccComentarioId) {
		this.tccComentarioId = tccComentarioId;
	}
	public int getTccCursoId() {
		return tccCursoId;
	}
	public void setTccCursoId(int tccCursoId) {
		this.tccCursoId = tccCursoId;
	}
	public String getTccResumo() {
		return tccResumo;
	}
	public void setTccResumo(String tccResumo) {
		this.tccResumo = tccResumo;
	}
	public String getTccTitulo() {
		return tccTitulo;
	}
	public void setTccTitulo(String tccTitulo) {
		this.tccTitulo = tccTitulo;
	}
	public String getTccPalavrasChaves() {
		return tccPalavrasChaves;
	}
	public void setTccPalavrasChaves(String tccPalavrasChaves) {
		this.tccPalavrasChaves = tccPalavrasChaves;
	}
	public byte getTccArquivo() {
		return tccArquivo;
	}
	public void setTccArquivo(byte tccArquivo) {
		this.tccArquivo = tccArquivo;
	}
	public double getTccNota() {
		return tccNota;
	}
	public void setTccNota(double tccNota) {
		this.tccNota = tccNota;
	}
	public Date getTccData() {
		return tccData;
	}
	public void setTccData(Date tccData) {
		this.tccData = tccData;
	}
}