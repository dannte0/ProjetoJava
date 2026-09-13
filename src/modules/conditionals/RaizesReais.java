package modules.conditionals;

import java.util.Scanner;

public class RaizesReais 
{
	public static void main(String[] args) 
	{
		float a = 0, b = 0, c = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente A:");
		a = in.nextFloat();
		System.out.println("Digite o coeficiente B:");
		b = in.nextFloat();
		System.out.println("Digite o coeficiente C:");
		c = in.nextFloat();
		calculaRaizes(calculaDelta(a, b, c), a, b);
		
		in.close();
	}
	
	public static float calculaDelta(float a, float b, float c)
	{
		float delta = (float)(Math.pow(b, 2) - 4 * a * c);
		return delta;
	}
	public static void calculaRaizes(float delta, float a, float b)
	{
		float raiz1 = 0, raiz2 = 0;
		if(delta > 0)
		{
			raiz1 = (float)((-b + Math.sqrt(delta)) / (2 * a));
			raiz2 = (float)((-b - Math.sqrt(delta)) / (2 * a));
			System.out.printf("Raíz 1: %.2f\nRaíz 2: %.2f", raiz1, raiz2);
		}
		else
		{
			System.out.println("Não há raízes reais.");
		}	
	}
}