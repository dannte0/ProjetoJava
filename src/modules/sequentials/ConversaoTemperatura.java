package modules.sequentials;

import java.util.Scanner;

public class ConversaoTemperatura 
{
	public static void main(String[] args) 
	{
		float celsius = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em ºC");
		celsius = in.nextFloat();
		converteCelsiusFahreinheit(celsius);
		
		in.close();
	}
	
	public static void converteCelsiusFahreinheit(float c)
	{
		float fahreinheit = (9 * c + 160) / 5;
		
		System.out.printf("Temperatura: %.1f ºF", fahreinheit);
	}
}
