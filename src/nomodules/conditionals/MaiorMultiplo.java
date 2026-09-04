package nomodules.conditionals;
import java.util.Scanner;


public class MaiorMultiplo 
{
	public static void main(String[] args) 
	{
		int valor1 = 0, valor2 = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = in.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = in.nextInt();
		
		if(valor1 > valor2)
		{
			if(valor1 % valor2 == 0)
			{
				System.out.printf("%d � multiplo de: %d", valor1, valor2);
			}
			else
			{
				System.out.printf("%d � maior, mas n�o � multiplo de: %d", valor1, valor2);
			}
		}
		else if(valor2 > valor1)
		{
			if(valor2 % valor1 == 0)
			{
				System.out.printf("%d � multiplo de: %d", valor2, valor1);				
			}
			else
			{				
				System.out.printf("%d � maior, mas n�o � multiplo de: %d", valor2, valor1);
			}
		}
		else
		{
			System.out.println("Os valores s�o iguais.");
		}
		in.close();
	}
}
