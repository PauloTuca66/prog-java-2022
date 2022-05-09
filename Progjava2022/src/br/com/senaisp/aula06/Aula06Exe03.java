package br.com.senaisp.aula06;

import java.util.Locale;
import java.util.Scanner;

public class Aula06Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Solicitar ao usu�rio um n�mero inteiro e apresentar a informa��o se o n�mero
		 * � primo ou n�o. Para um n�mero ser primo ele deve ser divis�vel somente por
		 * ele mesmo e por 1.
		 */
		int intResp = 1; // 1 - sim, 2 - n�o
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

		// come�ando o laco de repeti��o
		while (intResp != 2) {
			System.out.println("Verifica��o de n�mero Primo");
			System.out.println("Entre com o n�mero: ");
			int intNr = sc.nextInt();
			int intConDiv = 1; // contar divisores
			int intDiv = 1; // contar at� o n�mero
			while (intDiv < intNr) {
				intDiv++;
				if (intNr % intDiv == 0)
					intConDiv++;
			} // fechamento while do contador
			if (intConDiv > 2)
				System.out.println("O N�mero n�o � primo!");
			else
				System.out.println("O n�mero � Primo!");
			System.out.println("Deseja continuar? (1-sim / 2-n�o)");
			intResp = sc.nextInt();
		} // fechamento while sim/Nao

	}

}
