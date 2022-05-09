package br.com.senaisp.aula03;

import java.util.Scanner;

public class ExercicioAula03Atv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Conversor de Temperatura
		System.out.println("Conversor de Temperatura");
		
		// Converter Celsius p/ Fahrenheit
		System.out.println("Informe a temperatura em Celcius");
		Scanner sc = new Scanner (System.in);
		double dlbTem = sc.nextDouble();
		
		// Posso calcular diretamente
		System.out.println(" O Valor de Fah é:" +
		(9 * dlbTem / 5 + 32));
		
		// Posso calcular em uma variável
		double dlbValorFah = 9 * dlbTem / 5 + 32;
		System.out.println(" O Valor de Fah é:" + dlbValorFah);
		
		

		
		
	}

}
