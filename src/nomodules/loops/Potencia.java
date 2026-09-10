package nomodules.loops;

import java.util.Scanner;

public class Potencia 
{
	public static void main(String[] args) 
	{
		int base = 0, expoente = 0, potencia = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor da base:");
		base = in.nextInt();
		System.out.println("Digite o valor do expoente:");
		expoente = in.nextInt();
		
		for(int i = 1; i < expoente; i++)
		{
			if(i == 1)
			{
				potencia = base * base;
			}
			else
			{
				potencia = potencia * base;
			}
		}
		System.out.printf("Potencia de %d ^ %d = %d", base, expoente, potencia);
	}
}
