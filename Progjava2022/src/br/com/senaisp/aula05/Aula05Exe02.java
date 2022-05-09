package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Solicitar um número e informar se é par ou impar.
				System.out.println("Verificar se o numero é divisivel por 3 e 5");
				Scanner sc = new Scanner (System.in);
				System.out.println("Entre com o número");
				int intVlr = sc.nextInt();
				
				if (intVlr % 3 == 0 && intVlr % 5 == 0) 
					System.out.println("O número é divisivel por 3 e 5");
				else if (intVlr % 3 == 0)
					System.out.println("O número é divisivel por 3");
				else if (intVlr % 5 == 0)
					System.out.println("O número é divisivel por 5");
				else
					System.out.println("O número não é divisivel por 3 e 5");
		
	}

}
