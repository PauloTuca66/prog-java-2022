package br.com.senaisp.aula10;

public class Aula10Exe01 {
	/*
	 * Desenvolver um aplicativo solicite a quantidade de números primos desejada. 
	 * Essa quantidade deverá ser um número inteiro positivo menor que 15. 
	 * Após solicitar, apresentar os números primos de acordo com a quantidade solicitada. 
	 * Exemplo: Usuário digita 10, o sistema deverá apresentar os seguintes valores: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23
	 * Após apresentar os valores, perguntar se deseja continuar, se desejar continuar, solicite novamente e apresente, caso contrário, finalize o programa.
	 * Validações necessárias: Quantidade deverá ser maior que zero e menor que 15,tratar também o continuar sim ou não
	 * 
	 */
	public static void main(String[] args) {
		int intRes = 1, intCont, intPrimo, intNrTermos;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Digite a quantida de números primos: ");
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