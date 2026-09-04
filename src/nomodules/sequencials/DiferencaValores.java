package nomodules.sequencials;

import java.util.Scanner;

public class DiferencaValores 
{
	public static void main(String[] args) 
	{
		float x = 0, y = 0, diferenca = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		x = in.nextFloat();
		System.out.println("Digite o segundo valor:");
		y = in.nextFloat();
		diferenca = x - y;
		
		System.out.printf("A diferença entre %.2f e %.2f é: %.2f", x, y, diferenca);
		in.close();
	}
}
