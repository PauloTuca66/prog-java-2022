package br.com.senaisp.aula02;

import java.util.Scanner;

public class ExemploTiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aqui estamos fazendo uma soma
		int soma= 5+3;
		System.out.println("Soma: "+ soma);
		
		//Aqui estamos fazendo uma subtra��o
		int subtracao= 5-2;
		System.out.println("Subtra��o: "+ subtracao);
		
		//Agora multiplica��o
		int multiplicacao= 3*2;
		System.out.println("Multiplica��o: "+ multiplicacao);
		
		// Fazer a divis�o - Resposta sempre numero inteiro
		int divisao = 3/2;
		System.out.println("Divis�o Inteira: "+ divisao);
		
		// Fazer divis�o - Resposta pode ser com numero flutuante
		double divisaof = 3.00/2.00;
		System.out.println("Divis�o: " + divisaof);
		
		// Resto
		int resto = 3 % 2;
		System.out.println("Resto de Divis�o: " + resto);
		
		//usando somente o print
		System.out.print("Mostrando um valor");
		System.out.println("Outro valor");
		
		//usar o scanner
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome=sc.nextLine();
		System.out.println("Ol� " + nome);
		
		
	}

}
