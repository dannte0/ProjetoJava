package modules.sequentials;

import java.util.Scanner;

public class TrocaValores 
{

	public static void main(String[] args) 
	{
		int x = 0, y = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor(x): ");
		x = in.nextInt();
		System.out.println("Digite o segundo valor(y): ");
		y = in.nextInt();
		trocaValores(x, y);
		
		in.close();
	}
	public static void trocaValores(int a, int b)
	{
		int c = a;
		a = b;
		b = c;
		
		System.out.printf("Valor de x: %d\nValor de y: %d", a, b);
	}
}
