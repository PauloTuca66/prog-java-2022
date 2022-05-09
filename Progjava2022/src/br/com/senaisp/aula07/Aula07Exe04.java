package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula07Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Solicitar um número inteiro para o usuário e calcular o fatorial desse numero e apresentá-lo. 
 * Após apresentar, perguntar ao usuário se deseja calcular mais um número, 
 * se sim, continue a calcular, caso contrário, encerrar o programa
 */
		System.out.println("Calculo do Fatorial");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor que deve ser calculado o fatorial: ");
		int intValor = sc.nextInt();
		int intRes = 1;
		for (int intCont = intValor; intCont > 1; intCont--)
		intRes *= intCont;
		System.out.println("O resualtado é:" + intRes);	
		
	}
}
