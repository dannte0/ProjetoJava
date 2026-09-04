package nomodules.sequencial;

import java.util.Scanner;

public class AreaQuadrado 
{
	public static void main(String[] args) 
	{
		int lado = 0, area = 0;		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado.");
		lado = in.nextInt();
		area = lado * lado;
		
		System.out.printf("Tamanho da área: %d", area);
		in.close();
	}
}
