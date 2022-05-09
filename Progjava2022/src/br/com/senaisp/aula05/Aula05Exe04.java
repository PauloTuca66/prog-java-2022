package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escrever um programa que leia um peso na Terra e o número de um planeta. O
		 * programa deverá calcular o peso no planeta escolhido e mostrar quanto será o
		 * peso naquele planeta. O programa deverá mostrar a relação de planetas
		 * disponíveis para o usuário antes de solicitar o número do planeta. Abaixo a
		 * tabela dos planetas e sua gravidade em relação a Terra. # Gravidade relativa
		 * Planeta 1 0,37 Mercúrio 2 0,88 Vênus 3 0,38 Marte 4 2,64 Júpiter 5 1,15
		 * Saturno 6 1,17 Urano Fórmula para calcular o peso: PesoPlaneta =
		 * PesoNaTerra/10 x gravPlanet
		 */

		System.out.println("Sistema de calculo de peso de planetas");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Mercurio");
		System.out.println("2 - Venus");
		System.out.println("3 - Marte");
		System.out.println("4 - Jupiter");
		System.out.println("5 - Saturno");
		System.out.println("Informe o planeta desejado");
		int intPlaneta = sc.nextInt();
		System.out.println("Entre com o peso na Terra:");
		double dblPesoTerra = sc.nextDouble();
		double dblIndice = 10.00;
		switch (intPlaneta) {
		case 1:
			dblIndice = 0.37;
			break;
		case 2:
			dblIndice = 0.88;
			break;
		case 3:
			dblIndice = 0.38;
			break;
		case 4:
			dblIndice = 2.64;
			break;
		case 5:
			dblIndice = 1.17;
			break;
		default:
			System.out.println("Planeta Inválido!");
		}
		double dblPeso = dblPesoTerra / 10.00 * dblIndice;
System.out.println("O peso calculado e': " + dblPeso);
	}
}
