package br.com.senaisp.aula02;

import java.util.Scanner;

public class ExemploTiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aqui estamos fazendo uma soma
		int soma= 5+3;
		System.out.println("Soma: "+ soma);
		
		//Aqui estamos fazendo uma subtração
		int subtracao= 5-2;
		System.out.println("Subtração: "+ subtracao);
		
		//Agora multiplicação
		int multiplicacao= 3*2;
		System.out.println("Multiplicação: "+ multiplicacao);
		
		// Fazer a divisão - Resposta sempre numero inteiro
		int divisao = 3/2;
		System.out.println("Divisão Inteira: "+ divisao);
		
		// Fazer divisão - Resposta pode ser com numero flutuante
		double divisaof = 3.00/2.00;
		System.out.println("Divisão: " + divisaof);
		
		// Resto
		int resto = 3 % 2;
		System.out.println("Resto de Divisão: " + resto);
		
		//usando somente o print
		System.out.print("Mostrando um valor");
		System.out.println("Outro valor");
		
		//usar o scanner
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome=sc.nextLine();
		System.out.println("Olá " + nome);
		
		
	}

}
