package Lista01;

import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		// Solicita o ano de nascimento
		System.out.println("Digite o ano do nascimento:");
		int anonascimento = input.nextInt();
		
		// Solicita o ano atual
		System.out.println("Digite o ano atual");
		int anoatual = input.nextInt();
		
		int idadeatual = anoatual - anonascimento;
						
		// Calcula a idade da pessoa em 2050
       int  idade2050 = 2050 - anonascimento;
        
        // Imprime as informações
        System.out.println("Idade da pessoa no ano atual: " + idadeatual + " anos" );
        System.out.println("Idade da pessoa em 2050: " + idade2050 + " anos" );

		
		        
		
	}

}
