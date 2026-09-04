package nomodules.sequencial;

import java.util.Scanner;

public class ReajusteSalario 
{
	public static void main(String[] args) 
	{
		float salario = 0, novo_salario = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário.");
		salario = in.nextFloat();
		novo_salario = (float) (salario + (salario * 0.15));
		
		System.out.printf("Salário reajustado: %.2f", novo_salario);
		in.close();
	}
}
