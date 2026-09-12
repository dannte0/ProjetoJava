package modules.sequentials;

import java.util.Scanner;

public class RendimentoPoupanca 
{
	public static void main(String[] args) 
	{
		float deposito = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor depositado:");
		deposito = in.nextFloat();
		calculaRendimento(deposito);
		
		in.close();
	}
	
	public static void calculaRendimento(float d)
	{		
		float poupanca = (float) (d * 0.013 + d);
		
		System.out.printf("Valor final: %.2f", poupanca);
	}
}