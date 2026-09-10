package nomodules.loops;

import java.util.Scanner;

public class MaiorMenor 
{
	public static void main(String[] args) 
	{
		int n = 0, maior = 0, menor = 0;
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++)
		{
			System.out.printf("Digite o %dº numero:\n", i+1);
			n = in.nextInt();
			if(n > 0)
			{
				if(i == 0)
				{
					maior = n;
					menor = n;
				}
				else if(n > maior)
				{
					maior = n;
				}
				else if(n < menor)
				{
					menor = n;
				}
			}
		}
		System.out.printf("Menor numero: %d\nMaior numero: %d", menor, maior);
	}
}
