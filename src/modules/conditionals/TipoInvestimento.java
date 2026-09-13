package modules.conditionals;
import java.util.Scanner;

public class TipoInvestimento 
{
	public static void main(String[] args) 
	{
		int tipo_investimento = 0;
		float valor = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tipo de investimento (1 - Poupança) (2 - Renda Fixa):");
		tipo_investimento = in.nextInt();
		System.out.println("Digite o valor a ser investido:");
		valor = in.nextInt();
		calculaInvestimento(tipo_investimento, valor);
		
		in.close();
	}
	
	public static void calculaInvestimento(int ti, float v)
	{
		float montante = 0;
		if(ti == 1)
		{
			montante = (float) (v + v * 0.03);
			System.out.printf("Valor corrigido: R$ %.2f", montante);
		}
		else if(ti == 2)
		{
			montante = (float) (v + v * 0.05);
			System.out.printf("Valor corrigido: R$ %.2f", montante);			
		}
		else
		{
			System.out.println("Tipo de investimento inválido.");
		}
		
	}
}
