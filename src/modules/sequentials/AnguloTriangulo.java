package modules.sequentials;

import java.util.Scanner;

public class AnguloTriangulo 
{
	public static void main(String[] args) 
	{
		int a = 0, b = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do 1° ângulo:");
		a = in.nextInt();
		System.out.println("Digite o valor do 2° ângulo:");
		b = in.nextInt();
		calculaAngulo(a, b);
		in.close();
	}
	
	public static void calculaAngulo(int a, int b)
	{
		int angulo = 0;
		
		angulo = 180 - a - b;
		
		System.out.printf("O valor do 3° ângulo é: %d", angulo);
	}
	
}