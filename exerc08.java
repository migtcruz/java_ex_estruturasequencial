package Lista01;

import java.util.Scanner;


public class exerc08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8.	Faça um programa que receba uma temperatura em Celsius, 
		//      calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)
		Scanner scanner = new Scanner(System.in);
		
		// Receber e ler a temperatura Celsius
		System.out.println("Informe a temperatura em graus Celsius : ");
		double temp = scanner.nextDouble();
		
		// Calcular Temperatura em Fahrenheit
		double fah = (temp*1.8)+32;
		
		// Exibir Coversao
		System.out.println("A Temperatura em Fahrenheit é : "+fah);
		
				
	}

}
