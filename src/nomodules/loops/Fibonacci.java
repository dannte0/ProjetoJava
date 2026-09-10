package nomodules.loops;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int anterior = 0, atual = 1, proximo = 0, n = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor para receber a sequencia de fibonacci:");
		n = in.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.printf("F%d = %d\n",i+1, anterior);
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
		}
		in.close();
	}
}
