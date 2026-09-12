package modules.sequentials;

import java.util.Scanner;

public class ValorHipotenusa 
{
	public static void main(String[] args) 
	{
		float cateto_adjacente = 0, cateto_oposto = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do cateto adjacente:");
		cateto_adjacente = in.nextInt();
		System.out.println("Digite o valor do cateto oposto:");
		cateto_oposto = in.nextInt();
		
		calculaHipotenusa(somaQuadrados(cateto_adjacente, cateto_oposto));
		in.close();
	}
	public static float somaQuadrados(float ca, float co)
	{
		float soma = (float) (Math.pow(ca, 2) + Math.pow(co, 2));
		return soma;
	}
	public static void calculaHipotenusa(float soma)
	{
		float hipotenusa = (float) (Math.sqrt(soma));
		System.out.printf("Valor da hipotenusa: %.2f", hipotenusa);		
	}
}