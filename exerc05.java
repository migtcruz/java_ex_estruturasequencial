package Lista01;

import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5.	Faça um programa que receba o salário de um funcionário,
		// calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o salario do funcionario : ");
		double salario = scanner.nextDouble();
		
		double aumento = salario * 0.25;
		
		double novosal = aumento + salario;
		
		System.out.println("O novo salario do funcionario e : R$ "+novosal);
		
		
		
		
		
		
		
				
		
		
		
		
		
	}

}
