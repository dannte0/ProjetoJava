package modules.conditionals;
import java.util.Scanner;

public class Divisivel2e3 
{
	public static void main(String[] args) 
	{
		int numero = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		numero = in.nextInt();
		verificaDivisivel(numero);
		
		in.close();
	}
	
	public static void verificaDivisivel(int valor)
	{
		if(valor % 2 == 0 && valor % 3 == 0)
		{
			System.out.println("Divisivel por 2 e 3.");
			
			System.out.printf("%d / 2 = %d%n", valor, (valor/2));
			System.out.printf("%d / 3 = %d%n", valor, (valor/3));
		}
		else if(valor % 2 == 0)
		{
			System.out.println("Divisivel apenas por 2.");
			System.out.printf("%d / 2 = %d%n", valor, (valor/2));
		}
		else if(valor % 3 == 0)
		{
			System.out.println("Divisivel apenas por 3.");
			System.out.printf("%d / 3 = %d%n", valor, (valor/3));			
		}
		else
		{
			System.out.println("N�o divisivel por 2 e nem por 3.");
		}
		
	}
}
