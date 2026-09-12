package modules.sequentials;

import java.util.Scanner;

public class AreaTriangulo
{
	public static void main(String[] args) 
	{
		float base = 0, altura = 0;
		Scanner in = new Scanner(System.in);
		
		base = in.nextFloat();
		altura = in.nextFloat();
		
		System.out.printf("Tamanho da área: %.2f", calculaArea(base, altura));
		in.close();
	}
	
	public static float calculaArea(float b, float a)
	{
		float area = b * a / 2;
		
		return area;
	}
}
