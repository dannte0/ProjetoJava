package nomodules.loops;

import java.util.Scanner;

public class Tabuada 
{
	public static void main(String[] args) 
	{
		int numero = 0, resultado = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja receber a tabuada:");
		numero = in.nextInt();
		for(int i = 1; i <= 10; i++)
		{
			resultado = numero * i;
			System.out.printf("%d x %d = %d\n", numero, i, resultado);
		}
		in.close();
	}
}
