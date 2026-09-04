package nomodules.conditionals;
import java.util.Scanner;

public class OrdemCrescente2 
{
	public static void main(String[] args) {
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
		
		if(d > c)
		{
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", a, b, c, d);
		}
		else if(d < a)
		{
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", d, a, b, c);
		}
		else if(d > a && d < b)
		{			
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", a, d, b, c);
		}
		else if(d > b && d < c)
		{			
			System.out.printf("Em ordem crescente: %d, %d, %d, %d", a, b, d, c);
		}
		else
		{
			System.out.println("Igual a um dos valores");
		}
		in.close();
	}
}
