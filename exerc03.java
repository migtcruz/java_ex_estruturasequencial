package Lista01;

import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//solicitar cotacao ler cotacao valor real DOUBLE
		System.out.print("Informe a cotação atual do Dolar em Reais : ");
		double cotacao = scanner.nextDouble();
		
		//solicitar valor que possui em dolares valor real double
		System.out.print("Informe o valor em Dolares : ");
		double valordol = scanner.nextDouble();
		
		//Calculo 
		double valorreais = valordol * cotacao;
		
		// Saida
		System.out.println("O valor em reais é : R$ "+valorreais);
		
		
				
				
				
		
		
				
		
				

	}

}
