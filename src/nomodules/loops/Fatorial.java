package nomodules.loops;
import java.util.Scanner;

public class Fatorial 
{
	public static void main(String[] args) 
	{
		int numero = 0, fatorial = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja receber o fatorial:");
		numero = in.nextInt();
		for(int i = numero; i > 1; i--)
		{
			fatorial = fatorial * i;
		}
		
		System.out.printf("%d! = %d", numero, fatorial);
		in.close();
	}
}
