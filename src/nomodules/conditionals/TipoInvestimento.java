package nomodules.conditionals;
import java.util.Scanner;

public class TipoInvestimento 
{
	public static void main(String[] args) 
	{
		int tipo_investimento = 0;
		float valor = 0, montante = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tipo de investimento (1 - Poupan�a) (2 - Renda Fixa):");
		tipo_investimento = in.nextInt();
		
		if(tipo_investimento == 1)
		{
			montante = (float) (valor + valor * 0.03);
			System.out.printf("Valor corrigido: R$ %.2f", montante);
		}
		else if(tipo_investimento == 2)
		{
			montante = (float) (valor + valor * 0.05);
			System.out.printf("Valor corrigido: R$ %.2f", montante);			
		}
		else
		{
			System.out.println("Tipo de investimento inv�lido.");
		}
		in.close();
	}
}
