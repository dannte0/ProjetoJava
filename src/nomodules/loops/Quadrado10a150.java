package nomodules.loops;

public class Quadrado10a150 
{
	public static void main(String[] args) 
	{
		int quadrado = 0, i = 10;
		while(i <= 500)
		{
			quadrado = i * i;
			System.out.printf("Quadrado de %d: %d\n", i, quadrado);
			i += 1;
		}
	}
}
