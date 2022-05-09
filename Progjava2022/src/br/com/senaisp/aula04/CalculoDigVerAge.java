package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoDigVerAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo de Digito Verificador de Agencia");
		System.out.println("Entre com o número da Agencia (max. 4dig)");
		Scanner sc = new Scanner (System.in);
		int intNrAgencia = sc.nextInt();
		
		//Calculo da Agencia
		int intUn = intNrAgencia % 10;
		int intDz = intNrAgencia % 100/10;
		int intCn = intNrAgencia % 1000/100;
		int intMl = intNrAgencia % 1000;
		int intSoma = intUn * 6 + intDz * 7 + intCn * 8 + intMl * 9;
		int intDig = 10 - intSoma % 10;
		System.out.println("O digito verificar é " + intDig);
		

	}

}
