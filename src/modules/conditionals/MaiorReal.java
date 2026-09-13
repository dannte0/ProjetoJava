package modules.conditionals;

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
		verificaMaior(a, b);
		
		in.close();
	}
	
	public static void verificaMaior(float x, float y)
	{
		if(x > y)
		{
			System.out.printf("O maior valor é: %.2f", x);
		}
		else if(y > x)
		{
			System.out.printf("O maior valor é: %.2f", y);
		}
		else
		{
			System.out.println("Os dois valores são iguais.");
		}		
	}
}
