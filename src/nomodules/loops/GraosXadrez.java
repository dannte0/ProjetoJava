package nomodules.loops;

public class GraosXadrez 
{
	public static void main(String[] args) 
	{
		long graos = 0; 
		int casa = 0;
		
		for(int i = 1; i < 65; i++)
		{
			casa = i;
			if(casa == 1)
			{
				graos = 1;
			}
			else
			{
				graos = graos * 2;
			}
			System.out.printf("Casa: %d | Quantidade de Grãos: %d\n", casa, graos);
		}
	}
}
