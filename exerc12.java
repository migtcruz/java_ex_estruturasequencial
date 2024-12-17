package Lista01;

import java.util.Scanner;


public class exerc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 12.	Faça um programa que receba o raio, calcule e mostre:
		//     	O comprimento de uma esfera (C = 2 *  π  * R)
		//  	A área de uma esfera (A = π * R2)
		//  	O volume de uma esfera (V = ¾ *  π  * R3)
		Scanner scanner = new Scanner(System.in);
		
		// ler e receber raio da esfera
		System.out.println("Informe o Raio da Esfera : ");
		double raio = scanner.nextDouble();
		
		// calcular comprimento da esfera
		double comp = 2*Math.PI*raio;
		//Calcular Area da esfera
		double area = Math.PI*Math.pow(raio,2);
		// Calcular volume da esfera
		double volume = (0.75*Math.PI*Math.pow(raio,3));
		
		// Imprimir Resultados
		System.out.println("Valor do comprimento da esfera é : "+comp);
		System.out.println("Valor da area da esfera é :"+area);
		System.out.println("Valor do volume da esfera é : "+volume);
		
		
				
		
		
				
	}

}
