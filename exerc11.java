package Lista01;

import java.util.Scanner;


public class exerc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 11.	Faça um programa que receba o valor dos catetos de um triângulo,
		//      calcule e mostre o valor da hipotenusa.
				Scanner scanner = new Scanner(System.in);
		// Receber e ler valor dos catetos 	2
		System.out.println("Informe Cateto 1 do triangulo : ");
		double cat1 = scanner.nextDouble();
		System.out.println("Informe Cateto 2 do triangulo :");
		double cat2 = scanner.nextDouble();
		
		
		// Calcular valor hipotenusa c²=a²+b²
		double hipot = Math.sqrt((cat1*cat1)+(cat2*cat2));
		
		// Imprimir resultado
		System.out.println("O valor da hipotenusa é : "+hipot);
		
		
	}

}
