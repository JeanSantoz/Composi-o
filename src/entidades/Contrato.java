package entidades;

import java.util.Date;

public class Contrato {
	
	// Atributos
	
	private Date data;
	private Double valorPorHora;
	private Integer quantidadeHoras;

	
	// Construtores
	
	public Contrato() {}
	
	public Contrato(Date data, Double valorPorHora, Integer quantidadeHoras) {
		
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.quantidadeHoras = quantidadeHoras;
		
	}
	

	// gets and sets
	

	public Date getData() {
		return data;
	}
	
	

	public void setData(Date data) {
		this.data = data;
	}
	
	public Double getValorPorHora() {
		return valorPorHora;
	}
	
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}
	
	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}	
	
	// Métodos
	
	public Double valorTotal() {
		
		return valorPorHora * quantidadeHoras;
		
	}
	

}
