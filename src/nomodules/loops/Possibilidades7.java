package nomodules.loops;

public class Possibilidades7 
{
	public static void main(String[] args) 
	{	
		for(int dado1 = 1; dado1 < 7; dado1++)
		{
			for(int dado2 = 1; dado2 < 7; dado2 ++)
			{
				if(dado1 + dado2 == 7)
				{
					System.out.printf("%d, %d\n", dado1, dado2);
				}
			}
		}
	}
}
