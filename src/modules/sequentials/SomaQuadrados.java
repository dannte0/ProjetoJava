package modules.sequentials;

import java.util.Scanner;

public class SomaQuadrados 
{
	public static void main(String[] args) 
	{
		int x = 0, y = 0;
		Scanner in = new Scanner(System.in);
	
		System.out.println("Digite o primeiro valor:");
		x = in.nextInt();
		System.out.println("Digite o segundo valor:");
		y = in.nextInt();
		somar(x, y);
		
		in.close();
	}
	
	public static void somar(int a, int b)
	{
		int soma = (int) (Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.printf("Soma dos quadrados: %d", soma);
	}
}
