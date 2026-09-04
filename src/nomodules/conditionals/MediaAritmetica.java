package nomodules.conditionals;

import java.util.Scanner;

public class MediaAritmetica 
{
	public static void main(String[] args) 
	{
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0,
		media = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota:");
		nota1 = in.nextFloat();
		System.out.println("Digite o valor da segunda nota:");
		nota2 = in.nextFloat();
		System.out.println("Digite o valor da terceira nota:");
		nota3 = in.nextFloat();
		System.out.println("Digite o valor da quarta nota:");
		nota4 = in.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media < 3.0)
		{
			System.out.printf("Média final: %.1f\nResultado: RETIDO.", media);
		}
		else if(media >= 6.0)
		{
			System.out.printf("Média final: %.1f\nResultado: APROVADO.", media);
		}
		else
		{
			System.out.printf("Média atual: %.1f\nResultado: POSSIBILIDADE DE EXAME PARA RECUPERAÇÂO.", media);
		}
		in.close();
	}
}