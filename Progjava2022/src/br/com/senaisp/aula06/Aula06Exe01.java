package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe01 {

	// definindo o pi como constante
	static final double pi = 3.1415;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar uma classe chamada Aula06Exe01. Desenvolver um aplicativo para
		 * solicitar o raio e altura de um cilindro. Calcular a área do cilindro e
		 * mostrar o valor da área calculada. Após apresentar a área calculada,
		 * solicitar ao usuário se deseja continuar, caso deseje continuar, calcular
		 * novamente até que o usuário responda que não deseja continuar.
		 */

		int intResp = 1; // 1 - sim, 2 - não
		Scanner sc = new Scanner(System.in);

		// começando o laco de repetição
		while (intResp != 2) {

			// Limpando a tela - ver tabela de caracteres
			System.out.print("\033[H\033[2J");
			System.out.flush();
			// fim da limpeza

			System.out.println("Programa p/ calculo de cilindro");
			System.out.println("Digite o raio do cilindro");
			double dblRaio = sc.nextDouble();
			System.out.println("Digite a altura do cilindro");
			double dblAltura = sc.nextDouble();
			double dblArea = 2 * pi * dblRaio * (dblAltura + dblRaio);
			System.out.println("A área calculada é: " + dblArea);
			System.out.println("Deseja continuar? (1-sim / 2-não)");
			intResp = sc.nextInt();

		}
	}

}
