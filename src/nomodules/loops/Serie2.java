package nomodules.loops;

public class Serie2 
{
	public static void main(String[] args) 
	{
		float serie = 1, a = 2, b = 3, i = 1;
		
		while(i < 50)
		{
			serie = serie + a/b;
			a += 1;
			b += 2;
			i += 1;
		}
		System.out.printf("Serie = %.2f", serie);
	}
}
