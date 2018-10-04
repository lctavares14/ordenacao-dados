package atividade;

import java.util.ArrayList;
import java.util.List;

public class Formula {
	private Double altura;
	private Double largura;
	private Double comprimento;
	private Double resultado;
	List<String> resultados = new ArrayList<String>();
	
	public Double getResultado() {
		return resultado;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Double getComprimento() {
		return comprimento;
	}
	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	
	public void calcular() {
		resultado=altura*comprimento*largura;
		resultados.add(altura+" * "+largura+" * "+comprimento+" = "+resultado);
	}
	void imprimir() {
		System.out.println(resultados);	
	}
	
}
