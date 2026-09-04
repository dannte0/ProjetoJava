package nomodules.conditionals;

import java.util.Scanner;

public class OrdemCrescente 
{
	public static void main(String[] args) 
	{
		int a = 0, b = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		a = in.nextInt();
		System.out.println("Digite o segundo valor:");
		b = in.nextInt();
		
		if(a < b)
		{
			System.out.printf("Em ordem crescente: %d, %d", a, b);
		}
		else if(b < a)
		{			
			System.out.printf("Em ordem crescente: %d, %d", b, a);
		}
		else
		{
			System.out.printf("Valores iguais: %d = %d", a, b);
		}
		in.close();
	}
}
