package modules.sequentials;

import java.util.Scanner;

public class CombustivelGasto 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de horas dirigidas:");
		float tempo = in.nextFloat();
		System.out.println("Digite a velocidade média percorrida:");
		float velocidade_media = in.nextFloat();
		
		in.close();
		System.out.printf("A quantidade de litros gasta foi de: %.2f L", calculaLitrosGastos(calculaDistancia(velocidade_media, tempo)));		
	}

	public static float calculaDistancia(float vm, float t)
	{
		float distancia = vm * t;
		
		return distancia;
	}
	public static float calculaLitrosGastos(float d)
	{
		int AUTONOMIA = 12;
		float litros = d / AUTONOMIA;
		
		return litros;
	}
}