package br.com.senaisp.aula14;

import br.com.senaisp.aula14.classes.Mamiferos;

public class ExemploMamifero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objeto Mamifero
		Mamiferos boi = new Mamiferos ();
		boi.Boca = "Grande";
		boi.Olhos = "Marrom";
		boi.Pele = "Marrom";
		boi.Peso = 510.5;
		//Objeto Mamifero
		Mamiferos humano = new Mamiferos ();
		humano.Boca = "Pequena";
		humano.Olhos = "Azul";
		humano.Pele = "Amarela";
		humano.Peso = 55.3;
		//Vetor Mamiferos
		Mamiferos conjunto[] = new Mamiferos[10];
		//Criando o primeiro mamifero
		conjunto[0] = new Mamiferos();
		conjunto[0].Pele="Branca";
		conjunto[0].Boca="Grande";
		conjunto[0].Olhos="Negro";
		conjunto[0].Peso=10;
		//Criando o segundo mamifero
		conjunto[1] = new Mamiferos();
		conjunto[1].Pele="Morena";
		conjunto[1].Boca="Grande";
		conjunto[1].Olhos="Negro";
		conjunto[1].Peso=12;
		
	}

}
