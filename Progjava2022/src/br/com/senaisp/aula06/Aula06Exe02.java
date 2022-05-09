package br.com.senaisp.aula06;

import java.util.Locale;
import java.util.Scanner;

public class Aula06Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolver um aplicativo para solicitar a altura e o peso de uma pessoa.
		 * Calcular o IMC da pessoa e apresentar o IMC e o resultado de acordo com a
		 * tabela de IMC. Após apresentar perguntar se deseja continuar, se sim,
		 * calcular novamente, se não finalizar o programa. Fórmula do IMC = pesoPessoa
		 * / (alturaPessoa x alturaPessoa) IMC Faixa de peso Abaixo de 20 Abaixo do peso
		 * A partir de 20 até 25 Normal Acima de 25 até 30 Excesso de peso Acima de 30
		 * até 35 Obesidade Acima de 35 Obesidade mórbida
		 */
		int intResp = 1; // 1 - sim, 2 - não
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

		// começando o laco de repetição
		while (intResp != 2) {

			// Limpando a tela - ver tabela de caracteres
			System.out.print("\033[H\033[2J");
			System.out.flush();
			// fim da limpeza

			System.out.println("Programa p/ calculo IMC");
			System.out.println("Digite seu peso em kilos");
			double dblPeso = sc.nextDouble();
			System.out.println("Digite sua altura em metros");
			double dblAltura = sc.nextDouble();
			double dblImc = dblPeso / (dblAltura * dblAltura);
			System.out.println("Seu IMC é: " + dblImc);
			if (dblImc < 20.00)
				System.out.println("Vc está abaixo do peso");
			else if (dblImc >= 20.00 && dblImc <= 25.00)
				System.out.println("Vc está com peso normal");
			else if (dblImc > 25.00 && dblImc <= 30.00)
				System.out.println("Vc está com excesso de peso");
			else if (dblImc > 30.00 && dblImc <= 35.00)
				System.out.println("Vc está Obeso");
			else
				System.out.println("Vc está Obeso Morbido");

			System.out.println("Deseja continuar? (1-sim / 2-não)");
			intResp = sc.nextInt();
		}

	}

}
