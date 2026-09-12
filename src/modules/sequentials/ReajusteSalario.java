package modules.sequentials;

import java.util.Scanner;

public class ReajusteSalario 
{
	public static void main(String[] args) 
	{
		float salario = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário.");
		salario = in.nextFloat();
		calculaSalario(salario);
		
		in.close();
	}
	public static void calculaSalario(float s)
	{
		float novo_salario = (float) (s * 1.15);		
		System.out.printf("Salário reajustado: %.2f", novo_salario);
	}
}
