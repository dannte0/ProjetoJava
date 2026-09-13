package modules.conditionals;
import java.util.Scanner;

public class PrecosProdutos 
{
	public static void main(String[] args) 
	{
		int media_mensal = 0;
		float preco_atual = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a media mensal de vendas:");
		media_mensal = in.nextInt();
		System.out.println("Digite o preço do produto:");
		preco_atual = in.nextFloat();
		calculaPreco(preco_atual, media_mensal);
		
		in.close();
	}
	public static void calculaPreco(float pa, float mm)
	{
		float preco_novo = 0;
		if(pa >= 30 && pa < 80 && mm >= 500 && mm < 1000)
		{
			preco_novo = (float) (pa + pa * 0.15);
		}
		else if(pa >= 80 && mm >= 1000)
		{
			preco_novo = (float) (pa - pa * 0.05);
		}
		else if(pa < 30 && mm < 500)
		{
			preco_novo = (float) (pa + pa * 0.10);
		}
		else
		{
			preco_novo = pa;
		}		
		System.out.printf("O novo preço do produto será: %.2f", preco_novo);
	}
}
