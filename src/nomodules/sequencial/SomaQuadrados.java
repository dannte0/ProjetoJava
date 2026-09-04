package nomodules.sequencial;

import java.util.Scanner;

public class SomaQuadrados 
{
	public static void main(String[] args) 
	{
		int x = 0, y = 0, soma = 0;
		Scanner in = new Scanner(System.in);
	
		System.out.println("Digite o primeiro valor:");
		x = in.nextInt();
		System.out.println("Digite o segundo valor: ");
		y = in.nextInt();
		soma = (int) (Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.printf("Soma dos quadrados: %d", soma);
		in.close();
	}
}
