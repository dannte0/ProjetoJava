package nomodules.sequencial;

import java.util.Scanner;

public class AreaTriangulo
{
	public static void main(String[] args) 
	{
		float base = 0, altura = 0, area = 0;
		Scanner in = new Scanner(System.in);
		
		base = in.nextFloat();
		altura = in.nextFloat();
		area = base * altura / 2;
		
		System.out.printf("Tamanho da área: %.2f", area);
		in.close();
	}
}
