package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A prefeitura de Bauru abriu uma linha de cr�dito para os funcion�rios estatut�rios. 
		O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. 
		Fazer um programa que permita entrar com o sal�rio bruto e o valor da presta��o.
		O programa dever� informar se o empr�stimo poder� ser concedido ou n�o */
		
		System.out.println("Linha de Cr�dito PMBauru");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o Valor do seu sal�rio bruto");
		double dblSalario = sc.nextDouble();
		System.out.println("Digite o Valor da parcela a ser contratada");
		double dblParcela = sc.nextDouble();
		
		// verificar se � poss�vel contrair a d�vida:
		if (dblSalario * 30 / 100.00 >= dblParcela)
			System.out.println("Seu empr�stimo foi aprovado!");
			
		else
			System.out.println("Seu limite para emprestimo n�o � suficiente. Tente um valor menor.");
			
		
	}

}
