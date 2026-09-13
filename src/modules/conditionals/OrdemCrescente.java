package modules.conditionals;

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
		organizaNumeros(a, b);
		
		in.close();
	}
	
	public static void organizaNumeros(int x, int y)
	{
		if(x < y)
		{
			System.out.printf("Em ordem crescente: %d, %d", x, y);
		}
		else if(y < x)
		{			
			System.out.printf("Em ordem crescente: %d, %d", y, x);
		}
		else
		{
			System.out.printf("Valores iguais: %d = %d", x, y);
		}
	}
}
