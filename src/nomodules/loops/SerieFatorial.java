package nomodules.loops;

import java.util.Scanner;

public class SerieFatorial 
{
	public static void main(String[] args) 
	{
		int n = 0, fatorial = 1;
		float serie = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o numero para receber a serie (!):");
		n = in.nextInt();
		for(int i = 1; i <= n; i++)
		{
			fatorial = fatorial * i;
			serie = (float) (serie + 1.0/fatorial);
		}
		System.out.printf("Serie = %.4f", serie);
		in.close();
		
	}
}
