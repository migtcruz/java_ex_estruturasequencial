package Lista01;

import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6.	Faça um programa que solicite ao usuário que informe os coeficientes a, b e c 
		// de uma equação de segundo grau, imprima as raízes desta equação 
		//(considere que os valores informados sempre retornarão raízes reais para a equação).
		
		Scanner scanner = new Scanner(System.in);
						
		// Solicitar coeficientes a,b,c
		System.out.println("Informe coeficiente A : ");
		double a = scanner.nextDouble();
		System.out.println("Informe coeficiente B : ");
		double b = scanner.nextDouble();
		System.out.println("Informe coeficiente c : ");
		double c = scanner.nextDouble();
		
		// calculo do delta ( b² - 4ac )
		double delta = b * b - 4 * a * c;
		
		//Estrutura Repeticao  Inicio
		// verifica raizes reais 
		if(delta < 0) {
			System.out.println("Nao ha raizes reais nesta equação !!");
		} else {
			// calculo das raizes( (-b +- Raiz de delta) / 2a )
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a); 
		
            
            // Imprimir as raizes
            System.out.println(" As Raizes da equacao sao :");
            System.out.println(" X1 : " + x1);
            System.out.println(" X2 : " + x2); 
            
					
			}
			
		}
				
		
		
	}



