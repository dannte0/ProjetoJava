package modules.sequentials;

import java.util.Scanner;

public class ComprimentoCircunferencia 
{
	public static void main(String[] args) 
	{
		float raio = 0; 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio (cm):");
		raio = in.nextFloat();
		
		System.out.printf("Comprimento da circunferencia: %.2f cm", calculaCircunferencia(raio));
		in.close();
	}
	
	public static float calculaCircunferencia(float r)
	{
		float comprimento = (float)(2 * Math.PI * r);
		return comprimento;
	}
}
