package br.com.senaisp.aula05;

public class ExemplosComardoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intIdade = 60;
		
		//Uso da IF sem bloco de comando
		if (intIdade>=18)
			System.out.println("Voce � maior!");
		
		//Uso do IF em blocos de comando 
		if (intIdade>= 60) {
			System.out.println("Voce � adulto!");
			System.out.println("Voce � sexagen�rio!");
		}
		
		// Uso condicional do IF e do ELSE sem blocos
		if (intIdade >=18 && intIdade <=25) 
			System.out.println("Voc� � uma maior Jovem!");
		else
			System.out.println("Voc� � menor ou maior de 25 anos!");
			
		//Uso condicional IF e do ELSE com bloco	
		if (intIdade >= 18 && intIdade <= 25) {
			System.out.println("Voc� � um maior Jovem!");
		} else {
			System.out.println("Voc� � menor ou maior que 25 anos!");
		}
		
		//Condi��o IF (se) ELSE (sen�o) encadeado
		//Uso do condicional IF encadeado
		if (intIdade >= 18 && intIdade <= 25)
			System.out.println("Voce tem entre 18 e 25 anos!");
		else if (intIdade >= 26 && intIdade <= 35)
			System.out.println("Voce tem entre 26 e 35 anos! ");
		else
			System.out.println("Voce tem menos que 18 anos ou mais de 35 anos!");
		
		
	}

}
