package nomodules.sequentials;

import java.util.Scanner;

public class ValorHipotenusa 
{
	public static void main(String[] args) 
	{
		float cateto_adjacente = 0, cateto_oposto = 0,
		soma_quadrado = 0, hipotenusa = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do cateto adjacente:");
		cateto_adjacente = in.nextInt();
		System.out.println("Digite o valor do cateto oposto:");
		cateto_oposto = in.nextInt();
		soma_quadrado = (float) (Math.pow(cateto_adjacente, 2) + Math.pow(cateto_oposto, 2));
		hipotenusa = (float) (Math.pow(soma_quadrado, 0.5));
		
		System.out.printf("Valor da hipotenusa: %.2f", hipotenusa);
		in.close();
	}
}