package entidades;

import java.util.ArrayList;
import java.util.Calendar;
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
	
	public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
		
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
		
	}

	// gets and sets
	
	public String getNome() {
		return nome;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
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
		
		Calendar cal = Calendar.getInstance();
		
		
		for (Contrato c : contratos) {
			
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			if( c_mes == mes && c_ano == ano) {
			
				soma += c.valorTotal();
			}		
		}
		
		return soma;
	}
	

}
