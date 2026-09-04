package nomodules.sequencials;

import java.util.Scanner;

public class ConversaoTemperatura 
{
	public static void main(String[] args) 
	{
		float celsius = 0, fahreinheit = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em ºC");
		celsius = in.nextFloat();
		fahreinheit = (9 * celsius + 160) / 5;
		
		System.out.printf("Temperatura: %.1f ºF", fahreinheit);
		in.close();
	}
}
