package br.com.dio.desafio.dominio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

	private LocalDate data;

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public Mentoria() {
		super();
	}

	public Mentoria(LocalDate data) {
		super();
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	// Conversão de Data no formato desejado (utilizado no exercício atual):
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	// Método de conversão de String para data, não utilizado pois vou usar o
	// LocalDate.now() nesse exercício.
	SimpleDateFormat formatoSimples = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria="
				+ formato.format(data) + "]";
	}

}
