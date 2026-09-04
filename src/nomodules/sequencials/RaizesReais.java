package nomodules.sequencials;

import java.util.Scanner;

public class RaizesReais 
{
	public static void main(String[] args) 
	{
		float a = 1, b = -5, c = 6;
		double delta = 0, raiz1 = 0, raiz2 = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o coeficiente A.");
		a = in.nextFloat();
		System.out.println("Digite o coeficiente B.");
		b = in.nextFloat();
		System.out.println("Digite o coeficiente C.");
		c = in.nextFloat();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
		raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("Raiz 1: %.2f\nRaiz 2: %.2f", raiz1, raiz2);
		in.close();
	}
}
