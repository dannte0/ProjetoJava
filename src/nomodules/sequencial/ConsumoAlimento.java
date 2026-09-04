package nomodules.sequencial;

import java.util.Scanner;

public class ConsumoAlimento 
{
	public static void main(String[] args) 
	{
		float kg_alimento = 0;
		int dias = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade do alimento (kg):");
		kg_alimento = in.nextFloat();
		dias = (int)(kg_alimento / 0.05);
		
		System.out.printf("Quantidade de dias que o alimento durará:", dias);
		in.close();
	}
}