package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitar um n�mero e informar se � par ou impar.
		System.out.println("Verificar se � par ou impar");
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com o n�mero");
		int intVlr = sc.nextInt();
		
		if (intVlr % 2 == 0) 
			System.out.println("O n�mero � par!");
		else
			System.out.println("O n�mero � impar!");
		
	}

}
