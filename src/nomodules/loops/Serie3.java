package nomodules.loops;

public class Serie3 
{
	public static void main(String[] args) 
	{
		float serie = 1, a = 2, b = 4, i = 1;
		
		while(i < 15)
		{
			if(i % 2 == 0)
			{
				serie = serie + a/b;
			}
			else
			{
				serie = serie - a/b;
			}
			a += 1;
			b = (float) (Math.pow(a, 2));
			i += 1;
		}
		System.out.printf("Serie = %.4f", serie);
	}
}
