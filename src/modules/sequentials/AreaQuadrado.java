package modules.sequentials;

import java.util.Scanner;

public class AreaQuadrado 
{
	public static void main(String[] args) 
	{
		int lado = 0;		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado.");
		lado = in.nextInt();
		calculaArea(lado);
		
		in.close();
	}
	
	public static void calculaArea(int l)
	{
		int area = l * l;
		
		System.out.printf("Tamanho da área: %d", area);
	}
}
