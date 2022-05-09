package br.com.senaisp.aula06;

import java.util.Locale;
import java.util.Scanner;

public class Aula06Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Solicitar ao usuário uma temperatura, qual é a temperatura origem 
 * (1 – Celsius, 2 – Fahrenheit, 3 – Kelvin) e qual é a temperatura destino. 
 * Calcular a temperatura e apresentar o resultado. 
 * Após apresentar o resultado, perguntar ao usuário se deseja continuar a calcular, caso
positivo, solicitar os dados novamente e calcular, caso negativo, finalizar o programa.
 */
		
		int intResp = 1; // 1 - sim, 2 - não
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH); 
		// Scanner usará .decimal e não ,decimal

		// começando o laco de repetição
		while (intResp != 2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Sistema de calculo de temperatura");
			System.out.println("1 - Celsius");
			System.out.println("2 - Fahrenheit");
			System.out.println("3 - Kelvin");
			System.out.println("Temperatura de origem: (1 ou 2 ou 3)");
			int intTemOri = sc.nextInt();
			System.out.println("Valor da Temperatura que será convertida:");
			double dblTemperatura = sc.nextDouble();
			System.out.println("Temperatura de destino: (1 ou 2 ou 3)");
			int intTemDes = sc.nextInt();
			
			
			
			
			System.out.println("Verificação da temperatura");
			System.out.println("Informe a temperatura de Origem: "); //	(1 – Celsius, 2 – Fahrenheit, 3 – Kelvin)
			
		}
		
	}

}
