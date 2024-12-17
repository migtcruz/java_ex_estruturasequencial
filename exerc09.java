package Lista01;

import java.util.Scanner;

public class exerc09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9.programa que receba o valor do salário mínimo e o valor do salário de um funcionário, 
		//      calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
		Scanner scanner = new Scanner(System.in);
	
		// Solicitar e ler valor sal minimo e valor sal funcionario
		System.out.println("Informe o valor do Salario minimo atual : ");
		double salmin = scanner.nextDouble();
		System.out.println("Informe o valor do Salario atual do funcionaio :");
		double salfun = scanner.nextDouble();
		
		// Calcular qtde salarios minimos versus salario funcionario
		double qtde = salfun / salmin;
		
		// Exibir resultado
		System.out.println("O funcionario recebe : "+qtde+" salarios minimos");
	}

}
