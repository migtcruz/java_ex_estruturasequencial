package Lista01;

import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4.	Faça um programa que receba 
		// três notas de um aluno, calcule e mostre a média aritmética entre elas.

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe 1 nota do aluno : ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Informe 2 nota do aluno : ");
		double n2 = scanner.nextDouble();
		
		System.out.println("Informe 3 nota do aluno : ");
		double n3 = scanner.nextDouble();
		
		// calculo da media aritmetica
		double media = (n1+n2+n3)/3 ;
		
		System.out.println("A media aritmetico das notas é : " + media);
		
			
	}

}
