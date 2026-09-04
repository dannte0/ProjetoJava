package nomodules.sequencial;

import java.util.Scanner;

public class CombustivelGasto 
{
	public static void main(String[] args) 
	{
		float litros = 0, tempo = 0, distancia = 0,
		velocidade_media;
		int AUTONOMIA = 12;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de horas dirigidas:");
		tempo = in.nextFloat();
		System.out.println("Digite a velocidade média percorrida:");
		velocidade_media = in.nextFloat();
		distancia = velocidade_media * tempo;
		litros = distancia / AUTONOMIA;
		
		System.out.printf("A quantidade de litros gasta foi de: %.2f l", litros);
		in.close();
	}
}