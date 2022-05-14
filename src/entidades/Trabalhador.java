package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import enums.NivelDoTrabalhador;

public class Trabalhador {
	
	// Atributos
	
	private String nome;
	private NivelDoTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	
	// Construtores
	
	public Trabalhador() {}
	
	public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase) {
		
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		
	}

	// gets and sets
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public NivelDoTrabalhador getNivel() {
		return nivel;
	}
	
	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase) {
		
		this.salarioBase = salarioBase;
		
	}
	
	
	// Métodos
	
	public void adicionarContrato(Contrato contrato) {
		
		contratos.add(contrato);
		
	}
	
	public void removerContrato(Contrato contrato) {
		
		contratos.remove(contrato);
		
	}
	
	public double calcularSalario(int mes, int ano) {
		
		double soma = salarioBase;
		
		for (Contrato i : contratos) {
			
			if(i.getData().getMonth() == mes && i.getData().getYear() == ano) {
				
				soma += (i.getQuantidadeHoras() * i.getValorPorHora());
			}		
		}
		
		return soma;
	}
	

}
