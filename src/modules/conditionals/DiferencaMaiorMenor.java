package modules.conditionals;

import java.util.Scanner;

public class DiferencaMaiorMenor 
{
	public static void main(String[] args) 
	{
		int valor1 = 0, valor2 = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		valor1 = in.nextInt();
		System.out.println("Digite o segundo valor:");
		valor2 = in.nextInt();
		calculaDiferenca(valor1, valor2);
		
		in.close();
	}
	
	public static void calculaDiferenca(int n1, int n2)
	{
		int diferenca = 0;
		if(n1 > n2)
		{
			diferenca = n1 - n2;
			System.out.printf("%d - %d = %d", n1, n2, diferenca);
		}
		else if(n2 > n1)
		{
			diferenca = n2 - n1;
			System.out.printf("%d - %d = %d", n2, n1, diferenca);
		}
		else
		{
			System.out.println("Valores iguais");
		}		
	}
}