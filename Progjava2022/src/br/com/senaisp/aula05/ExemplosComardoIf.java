package br.com.senaisp.aula05;

public class ExemplosComardoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intIdade = 60;
		
		//Uso da IF sem bloco de comando
		if (intIdade>=18)
			System.out.println("Voce é maior!");
		
		//Uso do IF em blocos de comando 
		if (intIdade>= 60) {
			System.out.println("Voce é adulto!");
			System.out.println("Voce é sexagenário!");
		}
		
		// Uso condicional do IF e do ELSE sem blocos
		if (intIdade >=18 && intIdade <=25) 
			System.out.println("Você é uma maior Jovem!");
		else
			System.out.println("Você é menor ou maior de 25 anos!");
			
		//Uso condicional IF e do ELSE com bloco	
		if (intIdade >= 18 && intIdade <= 25) {
			System.out.println("Você é um maior Jovem!");
		} else {
			System.out.println("Você é menor ou maior que 25 anos!");
		}
		
		//Condição IF (se) ELSE (senão) encadeado
		//Uso do condicional IF encadeado
		if (intIdade >= 18 && intIdade <= 25)
			System.out.println("Voce tem entre 18 e 25 anos!");
		else if (intIdade >= 26 && intIdade <= 35)
			System.out.println("Voce tem entre 26 e 35 anos! ");
		else
			System.out.println("Voce tem menos que 18 anos ou mais de 35 anos!");
		
		
	}

}
