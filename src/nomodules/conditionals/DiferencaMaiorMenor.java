package nomodules.conditionals;

import java.util.Scanner;

public class DiferencaMaiorMenor 
{
	public static void main(String[] args) 
	{
		int valor1 = 0, valor2 = 0, diferenca = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		valor1 = in.nextInt();
		System.out.println("Digite o segundo valor:");
		valor2 = in.nextInt();
		
		if(valor1 > valor2)
		{
			diferenca = valor1 - valor2;
			System.out.printf("%d - %d = %d", valor1, valor2, diferenca);
		}
		else if(valor2 > valor1)
		{
			diferenca = valor2 - valor1;
			System.out.printf("%d - %d = %d", valor2, valor1, diferenca);
		}
		else
		{
			System.out.println("Valores iguais");
		}
		in.close();
	}
}