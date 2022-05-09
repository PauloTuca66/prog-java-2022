package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoJurosFuturos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculos de Aplicação Futura");
		System.out.println("Digite o valor aplicado:");
		Scanner sc = new Scanner (System.in);
		double dblValorAplicado = sc.nextDouble();
		System.out.println("Digite o tempo aplicado (em meses):");
		int intTempoAplicado = sc.nextInt();
		System.out.println("Digite o percentual de juros:" );
		double dblJuros = sc.nextDouble();
		
		//Calculo dos Juros
		double dblValorFuturo = dblValorAplicado * Math.pow((1+ dblJuros / 100.00), intTempoAplicado);
		
		// Mostrando o Resultado
		System.out.println("O valor aplicado será de R$ " + dblValorFuturo);
		
		
	}

}
