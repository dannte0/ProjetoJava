package nomodules.loops;

import java.util.Scanner;

public class NumerosPrimos 
{
	public static void main(String[] args) 
	{
		int n1 = 0, n2 = 0, primo = 0, cont = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		n1 = in.nextInt();
		System.out.println("Digite o segundo valor:");
		n2 = in.nextInt();
		System.out.printf("Numeros primos entre %d e %d:\n", n1, n2);
		
		while(n1 < n2)
		{
			cont = 0;
			for(int i = 2; i < n1; i++)
			{
				if(n1 % i == 0)
				{
					cont = n1;
					break;
				}
			}
			if(cont == 0 && n1 > 1)
			{
				primo = n1;
				System.out.println(primo);
			}
			n1 += 1;
		}
	}
}
