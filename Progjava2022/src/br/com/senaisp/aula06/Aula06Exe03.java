package br.com.senaisp.aula06;

import java.util.Locale;
import java.util.Scanner;

public class Aula06Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Solicitar ao usuário um número inteiro e apresentar a informação se o número
		 * é primo ou não. Para um número ser primo ele deve ser divisível somente por
		 * ele mesmo e por 1.
		 */
		int intResp = 1; // 1 - sim, 2 - não
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

		// começando o laco de repetição
		while (intResp != 2) {
			System.out.println("Verificação de número Primo");
			System.out.println("Entre com o número: ");
			int intNr = sc.nextInt();
			int intConDiv = 1; // contar divisores
			int intDiv = 1; // contar até o número
			while (intDiv < intNr) {
				intDiv++;
				if (intNr % intDiv == 0)
					intConDiv++;
			} // fechamento while do contador
			if (intConDiv > 2)
				System.out.println("O Número não é primo!");
			else
				System.out.println("O número é Primo!");
			System.out.println("Deseja continuar? (1-sim / 2-não)");
			intResp = sc.nextInt();
		} // fechamento while sim/Nao

	}

}
