package br.com.dio.desafio.dominio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria {

	private String titulo;
	private String descricao;
	private LocalDate cargaHoraria;

	public Mentoria() {
		super();
	}

	public Mentoria(String titulo, String descricao, LocalDate cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(LocalDate cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	// Conversão de Data no formato desejado (utilizado no exercício atual):
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	
	// Método de conversão de String para data, não utilizado pois vou usar o LocalDate.now() nesse exercício.
	SimpleDateFormat formatoSimples = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + formato.format(cargaHoraria) + "]";
	}

}
