package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Solicitar um n�mero e informar se � par ou impar.
				System.out.println("Verificar se o numero � divisivel por 3 e 5");
				Scanner sc = new Scanner (System.in);
				System.out.println("Entre com o n�mero");
				int intVlr = sc.nextInt();
				
				if (intVlr % 3 == 0 && intVlr % 5 == 0) 
					System.out.println("O n�mero � divisivel por 3 e 5");
				else if (intVlr % 3 == 0)
					System.out.println("O n�mero � divisivel por 3");
				else if (intVlr % 5 == 0)
					System.out.println("O n�mero � divisivel por 5");
				else
					System.out.println("O n�mero n�o � divisivel por 3 e 5");
		
	}

}
