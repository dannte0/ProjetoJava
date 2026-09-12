package nomodules.sequentials;

import java.util.Scanner;

public class RendimentoPoupanca 
{
	public static void main(String[] args) 
	{
		float deposito = 0, poupanca = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor depositado:");
		deposito = in.nextFloat();
		poupanca = (float) (deposito * 0.013 + deposito);
		
		System.out.printf("Valor final: %.2f", poupanca);
		in.close();
	}
}