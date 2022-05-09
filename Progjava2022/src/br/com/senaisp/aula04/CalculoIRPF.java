package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoIRPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o salário base (acima de 5.000,00):");
		Scanner sc = new Scanner(System.in);
		double dblSalarioBase = sc.nextDouble();
		System.out.println("Digite o nmero de dependentes´:");
		int intNDependentes = sc. nextInt();
		double dblIrpfBase = dblSalarioBase - intNDependentes * 189.59 - 828.38;
		double dblIrpfVlr = dblIrpfBase * 27.5 / 100 - 869.36;
		System.out.println("A base de calculo do IRPF é: " + dblIrpfBase);
		System.out.println("O valor do IRPF é: " + dblIrpfVlr);
	
		
	}

}
