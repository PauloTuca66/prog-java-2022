package br.com.senaisp.aula06;

public class ExemplosComandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exemplo do uso do While
		int intValor = 10;

		// Mostrar os valores de 10 a 1 descrescente e
		// classificar em par ou impar
		while (intValor > 0) {
			if (intValor % 2 == 0)
				System.out.println("O valor " + intValor + " é par.");
			else
				System.out.println("O valor " + intValor + " é impar.");

			intValor--;
		}

	}
}
