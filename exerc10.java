package Lista01;

import java.util.Scanner;

public class exerc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		// 10.	Faça um programa que receba o peso de uma pessoa, calcule e mostre:
		//	    a)	O seu novo peso, se a pessoa engordar 15% sobre o peso digitado
		//  	b)	O seu novo peso, se a pessoa emagrecer 20% sobre o peso digitado
		
		Scanner scanner = new Scanner(System.in);
		
		// Receber e ler peso da pessoa
		System.out.println("Informe o peso da pessoa : ");
		double peso = scanner.nextDouble();
		
		// Calcular novo peso + 15%
		double pesomais = peso+(peso*0.15);
		// Calcular novo peso - 20%
		double pesomenos = peso-(peso*0.20);
		
		// Imprimir resutados
		System.out.println("Novo peso 15% a mais é :"+pesomais);
		System.out.println("Novo peso 20% a menos é : "+pesomenos);
		
		
		
		

		

	}

}
