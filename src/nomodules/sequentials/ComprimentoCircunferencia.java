package nomodules.sequentials;

import java.util.Scanner;

public class ComprimentoCircunferencia 
{
	public static void main(String[] args) 
	{
		float raio = 0, comprimento = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio (cm):");
		raio = in.nextFloat();
		comprimento = (float)(2 * Math.PI * raio);
		
		System.out.printf("Comprimento da circunferencia: %.2f cm", comprimento);
		in.close();
	}
}
