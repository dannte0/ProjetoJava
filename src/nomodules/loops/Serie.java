package nomodules.loops;

import java.util.Scanner;

public class Serie 
{
	public static void main(String[] args) 
	{
		int numero = 0; 
		float serie = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja saber a serie:");
		numero = in.nextInt();
		for(int i = 1; i < numero; i++)
		{
			serie = (float)(serie + 1.0/i);
		}
		System.out.printf("Serie = %.4f\n", serie);
		
		in.close();
	}
}
