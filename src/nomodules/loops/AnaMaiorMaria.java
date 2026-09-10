package nomodules.loops;

public class AnaMaiorMaria 
{
	public static void main(String[] args) 
	{
		float alturaAna = (float)(1.1), alturaMaria = (float)(1.5);
		int quantidade_anos = 0;
		
		while(alturaAna <= alturaMaria)
		{
			quantidade_anos += 1;
			alturaAna = (float) (alturaAna + 0.03); 
			alturaMaria = (float) (alturaMaria + 0.02); 
		}
		System.out.printf("Levará %d anos para a altura de Ana ultrapassar a altura de Maria.", quantidade_anos);
	}
}
