package modules.sequentials;

import java.util.Scanner;

public class ConsumoAlimento 
{
	public static void main(String[] args) 
	{
		float kg_alimento = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade do alimento (kg):");
		kg_alimento = in.nextFloat();
		calculaQtdDias(kg_alimento);
		
		in.close();
	}
	
	public static void calculaQtdDias(float kg)
	{
		int dias = (int)(kg / 0.05);
		
		System.out.printf("Quantidade de dias que o alimento durará:", dias);
	}
}