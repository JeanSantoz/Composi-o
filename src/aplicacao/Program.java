package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Trabalhador;
import enums.NivelDoTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe o nome do departamento: ");
		String nomeDeartamento = sc.next();
		
		System.out.println("Informe os Dados do Trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Salario Base: ");
		Double salario = sc.nextDouble();
		System.out.print("Nivel: ");
		String nivel = sc.next();
		
		Trabalhador t1 = new Trabalhador(nome, NivelDoTrabalhador.valueOf(nivel), salario, new Departamento(nomeDeartamento));
		
		System.out.println("Informe o número de contratos: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Informe os Dados do Contrato: ");
			System.out.print("Data (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Preço da Hora: ");
			double preco = sc.nextDouble();
			System.out.print("Horas Totais: ");
			int horas = sc.nextInt() ;
			Contrato contrato = new Contrato(data, preco, horas);
			t1.adicionarContrato(contrato);
			
			
		}
		
		System.out.println();
		System.out.print("Informe o mes e o ano para calcular a renda (MM/YYYY): ");
		String meseano = sc.next();
		int mes = Integer.parseInt(meseano.substring(0, 2));
		int ano = Integer.parseInt(meseano.substring(3));
		System.out.println("Name: " + t1.getNome());
		System.out.println("Department: " + t1.getDepartamento().getNome());
		System.out.println("Income for " + meseano + ": " + String.format("%.2f", t1.calcularSalario(mes, ano)));

	}

}
