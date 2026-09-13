package modules.conditionals;
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
		verificaMultiplo(valor1, valor2);
		
		in.close();
	}
	
	public static void verificaMultiplo(int n1, int n2)
	{
		if(n1 > n2)
		{
			if(n1 % n2 == 0)
			{
				System.out.printf("%d é multiplo de: %d", n1, n2);
			}
			else
			{
				System.out.printf("%d é maior, mas não é multiplo de: %d", n1, n2);
			}
		}
		else if(n2 > n1)
		{
			if(n2 % n1 == 0)
			{
				System.out.printf("%d é multiplo de: %d", n2, n1);				
			}
			else
			{				
				System.out.printf("%d é maior, mas não é multiplo de: %d", n2, n1);
			}
		}
		else
		{
			System.out.println("Os valores são iguais.");
		}
	}
}
