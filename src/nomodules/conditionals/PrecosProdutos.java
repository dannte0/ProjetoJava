package nomodules.conditionals;
import java.util.Scanner;

public class PrecosProdutos 
{
	public static void main(String[] args) 
	{
		int media_mensal = 0;
		float preco_atual = 0, preco_novo = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a media mensal de vendas:");
		media_mensal = in.nextInt();
		System.out.println("Digite o pre�o do produto:");
		preco_atual = in.nextFloat();
		
		if(preco_atual >= 30 && preco_atual < 80 && media_mensal >= 500 && media_mensal < 1000)
		{
			preco_novo = (float) (preco_atual + preco_atual * 0.15);
		}
		else if(preco_atual >= 80 && media_mensal >= 1000)
		{
			preco_novo = (float) (preco_atual - preco_atual * 0.05);
		}
		else if(preco_atual < 30 && media_mensal < 500)
		{
			preco_novo = (float) (preco_atual + preco_atual * 0.10);
		}
		else
		{
			preco_novo = preco_atual;
		}
		System.out.printf("O novo pre�o do produto ser�: %.2f", preco_novo);
		in.close();
	}
}
