package nomodules.loops;

import java.util.Scanner;

public class SomatoriaImpares 
{
	public static void main(String[] args) 
	{
		int n1 = 0, n2 = 0, resultado = 0;
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Digite o primeiro valor:");
		n1 = in.nextInt();
		System.out.println("Digite o segundo valor:");
		n2 = in.nextInt();
		
		if(n1 > n2)
		{
			for(int i = n2; i <= n2; i++)
			{
				if(i % 2 == 1)
				{
					resultado = resultado + i;
				}
			}
			System.out.printf("Somatoria de impares entre %d e %d = %d", n2, n1, resultado);
		}
		else if(n1 < n2)
		{
			for(int i = n1; i <= n2; i++)
			{
				if(i % 2 == 1)
				{
					resultado = resultado + i;
				}
			}
			System.out.printf("Somatoria de impares entre %d e %d = %d", n1, n2, resultado);
		}
		in.close();
	}
}
