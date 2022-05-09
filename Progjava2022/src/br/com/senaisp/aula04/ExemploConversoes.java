package br.com.senaisp.aula04;

public class ExemploConversoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definindo uma variável double com um valor qualquer
		double dblTeste = 51.12;
		System.out.println("Double; " + dblTeste);
		
		// Convertendo para Float
		float fltTeste = (float) dblTeste;
		System.out.println("Float: " + fltTeste);
		
		// Convertendo para long (inteiro)
		long lngTeste = (long)fltTeste;
		System.out.println("Long; " + lngTeste);
		
		// Convertendo para int (inteiro)
		int intTeste = (int)lngTeste;
		System.out.println("Int; " + intTeste);
		
		//Convertendo para short (inteiro)
		short shtTeste = (short) intTeste;
		System.out.println("Short; " + shtTeste);
		
		//Convertendo para byte (inteiro)
		byte bytTeste = (byte) shtTeste;
		System.out.println("Byte; " + bytTeste);
		
		//Convertendo texto p/ números
		System.out.println("Vamos inciar Conversão de String p/ Números");
		String strValor = "52";
		
		//Convertendo p/ Double
		dblTeste = Double.parseDouble(strValor);
		System.out.println("Double: " + dblTeste);

		//Convertendo p/ Float
		fltTeste = Float.parseFloat(strValor);
		System.out.println("Flout: " + fltTeste);
		
		//Convertendo p/ Load
		lngTeste = Long.parseLong (strValor);
		System.out.println("Long: " + lngTeste);
		
		//Convertendo p/ Inteiro
		intTeste = Integer.parseInt(strValor);
		System.out.println("Int: " + intTeste);
		
		//Convertendo p/ Short
		shtTeste = Short.parseShort(strValor);
		System.out.println("Short: " + shtTeste);
		
		//Convertendo p/ Byte
		bytTeste = Byte.parseByte(strValor);
		System.out.println("Byte: " + bytTeste);
		
		//Convertendo p/ String
		System.out.println("Agora vamos de números p/ String/Caracter");
		intTeste = 65;
		//Na Tabela Ascili A = 65
		char chrTeste = (char) intTeste;
		System.out.println("Char: " + chrTeste);
		
		//Convertendo de Double p/ String
		dblTeste = 52.12;
		String strTeste = Double.toString(dblTeste);
		System.out.println("Double p/ String: " + strTeste);
		
		//Convertendo de Float p/ String
		fltTeste = 52.12f;
		strTeste = Float.toString(fltTeste);
		System.out.println("Float p/ String: " + strTeste);
				
		//Convertendo de Long p/ String
		lngTeste = 523;
		strTeste = Long.toString(lngTeste);
		System.out.println("Long p/ String: " + strTeste);
		
		//Convertendo de Inteiro p/ String
		intTeste = 523;
		strTeste = Long.toString(intTeste);
		System.out.println("Inteiro p/ String: " + strTeste);
		
		//Convertendo de Shot p/ String
		shtTeste = 523;
		strTeste = Long.toString(shtTeste);
		System.out.println("Shot p/ String: " + strTeste);
		
		//Convertendo de Byte p/ String
		bytTeste = 52;
		strTeste = Long.toString(bytTeste);
		System.out.println("Byte p/ String: " + strTeste);
		
		
		
		
		
		
		
		
	}

}
