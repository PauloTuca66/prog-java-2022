package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula07Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Solicitar um n�mero inteiro para o usu�rio e calcular o fatorial desse numero e apresent�-lo. 
 * Ap�s apresentar, perguntar ao usu�rio se deseja calcular mais um n�mero, 
 * se sim, continue a calcular, caso contr�rio, encerrar o programa
 */
		System.out.println("Calculo do Fatorial");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor que deve ser calculado o fatorial: ");
		int intValor = sc.nextInt();
		int intRes = 1;
		for (int intCont = intValor; intCont > 1; intCont--)
		intRes *= intCont;
		System.out.println("O resualtado �:" + intRes);	
		
	}
}
