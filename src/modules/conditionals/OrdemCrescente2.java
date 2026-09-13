package modules.conditionals;
import java.util.Scanner;

public class OrdemCrescente2 
{
	public static void main(String[] args) 
	{
		int a = 0, b = 0, c = 0, d = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		a = in.nextInt();
		System.out.println("Digite o segundo valor:");
		b = in.nextInt();
		System.out.println("Digite o terceiro valor:");
		c = in.nextInt();
		System.out.println("Digite o quarto valor:");
		d = in.nextInt();
		organizaNumeros(a, b, c, d);
		
		in.close();
	}
	public static void organizaNumeros(int n1, int n2, int n3, int x)
	{
		if(x > n3)
		{
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", n1, n2, n3, x);
		}
		else if(x < n1)
		{
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", x, n1, n2, n3);
		}
		else if(x > n1 && x < n2)
		{			
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", n1, x, n2, n3);
		}
		else if(x > n2 && x < n3)
		{			
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", n1, n2, x, n3);
		}
		else
		{
			System.out.println("Igual a um dos valores");
		}
	}
}
