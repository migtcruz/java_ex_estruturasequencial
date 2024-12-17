package Lista01;

import java.util.Scanner;



public class exerc07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7.	Faça um programa que calcule e mostre a área de um losango 
		//      AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2
		
		Scanner scanner = new Scanner(System.in);
		
		//Solicitar e ler diagonais do losango
		System.out.println("Digite a Diagonal Maior do Losango : ");
		double DM = scanner.nextDouble();
		System.out.println("Digite a Diagonal Menor do Losango : ");
		double dm = scanner.nextDouble();
		
		// Calculo da Area Losango
		double area = (DM * dm)/2;
		
		// Exibir Area
		System.out.println("A Area do Losango é : "+area);
		

	}

}
