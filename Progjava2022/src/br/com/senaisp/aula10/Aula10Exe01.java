package br.com.senaisp.aula10;

public class Aula10Exe01 {
	/*
	 * Desenvolver um aplicativo solicite a quantidade de n�meros primos desejada. 
	 * Essa quantidade dever� ser um n�mero inteiro positivo menor que 15. 
	 * Ap�s solicitar, apresentar os n�meros primos de acordo com a quantidade solicitada. 
	 * Exemplo: Usu�rio digita 10, o sistema dever� apresentar os seguintes valores: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23
	 * Ap�s apresentar os valores, perguntar se deseja continuar, se desejar continuar, solicite novamente e apresente, caso contr�rio, finalize o programa.
	 * Valida��es necess�rias: Quantidade dever� ser maior que zero e menor que 15,tratar tamb�m o continuar sim ou n�o
	 * 
	 */
	public static void main(String[] args) {
		int intRes = 1, intCont, intPrimo, intNrTermos;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Digite a quantida de n�meros primos: ");
			intNrTermos = sc.nextInt();
			intCont = 1;
			intPrimo = 0;
			while (intPrimo < intNrTermos) {
				intContDiv = 0;
				for (int intPasso=1; intPasso <= intCont; intPasso++ ) {
					if (intCont % intPasso == 0) {
						intContDiv++;
					}// fim do if
					intCont++;	
				}// fim do for
				if (intContDiv<=2) {
				// if Primo
			}
		
		
	}

}