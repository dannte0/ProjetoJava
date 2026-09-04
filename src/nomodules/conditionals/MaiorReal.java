package nomodules.conditionals;

import java.util.Scanner;

public class MaiorReal 
{
	public static void main(String[] args) 
	{
		float a = 0, b = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		a = in.nextFloat();
		System.out.println("Digite o segundo valor:");
		b = in.nextFloat();
		
		if(a > b)
		{
			System.out.printf("O maior valor é: %.2f", a);
		}
		else if(b > a)
		{
			System.out.printf("O maior valor é: %.2f", b);
		}
		else
		{
			System.out.println("Os dois valores são iguais.");
		}
		in.close();
	}
}
