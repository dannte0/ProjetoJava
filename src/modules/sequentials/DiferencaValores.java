package modules.sequentials;

import java.util.Scanner;

public class DiferencaValores 
{
	public static void main(String[] args) 
	{
		float x = 0, y = 0; 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		x = in.nextFloat();
		System.out.println("Digite o segundo valor:");
		y = in.nextFloat();	
		subtracao(x, y);
		
		in.close();
	}
	public static void subtracao(float a, float b)
	{
		float diferenca = a - b;
		
		System.out.printf("A diferença entre %.2f e %.2f é: %.2f", a, b, diferenca);
	}
}
