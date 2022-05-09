package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A prefeitura de Bauru abriu uma linha de crédito para os funcionários estatutários. 
		O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
		Fazer um programa que permita entrar com o salário bruto e o valor da prestação.
		O programa deverá informar se o empréstimo poderá ser concedido ou não */
		
		System.out.println("Linha de Crédito PMBauru");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o Valor do seu salário bruto");
		double dblSalario = sc.nextDouble();
		System.out.println("Digite o Valor da parcela a ser contratada");
		double dblParcela = sc.nextDouble();
		
		// verificar se é possível contrair a dívida:
		if (dblSalario * 30 / 100.00 >= dblParcela)
			System.out.println("Seu empréstimo foi aprovado!");
			
		else
			System.out.println("Seu limite para emprestimo não é suficiente. Tente um valor menor.");
			
		
	}

}
