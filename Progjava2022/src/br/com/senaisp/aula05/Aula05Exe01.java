package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitar um número e informar se é par ou impar.
		System.out.println("Verificar se é par ou impar");
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com o número");
		int intVlr = sc.nextInt();
		
		if (intVlr % 2 == 0) 
			System.out.println("O número é par!");
		else
			System.out.println("O número é impar!");
		
	}

}
