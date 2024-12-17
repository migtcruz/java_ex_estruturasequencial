package Lista01;

import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Soicita numero para ver tabuada
		System.out.print("Digite um numero para ver sua tabuada de multiplicção : ");
		int num = scanner.nextInt();
		
		System.out.println("Tabuada de multiplicação para o número escolhido é : " + num );
		
		// Estrtutura de Repetição
		for (int i = 0; i <= 10; i++ ) {
			int resultado = num * i ;
			// Fim Repetição
			
			System.out.println(num + " X " + i + " = "+ resultado);
			
					
		}
		
		
	}

}
