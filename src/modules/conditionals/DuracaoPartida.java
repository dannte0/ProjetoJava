package modules.conditionals;
import java.util.Scanner;

public class DuracaoPartida 
{
	public static void main(String[] args) 
	{
		int hora_inicio = 0, minuto_inicio = 0, hora_fim = 0, minuto_fim = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		hora_inicio = in.nextInt();
		System.out.println("Digite o minuto inicial: ");
		minuto_inicio = in.nextInt();
		System.out.println("Digite a hora final: ");
		hora_fim = in.nextInt();
		System.out.println("Digite o minuto final: ");
		minuto_fim = in.nextInt();


//		do
//		{
//		} while(hora_inicio < 0 || hora_inicio > 24 || minuto_inicio < 0 || minuto_inicio >= 60 ||
//				hora_fim < 0 || hora_fim > 24 || minuto_fim < 0 || minuto_fim >= 60);
		
		calculaDuracao(hora_inicio, minuto_inicio, hora_fim, minuto_fim);
		
		in.close();
	}
	public static void calculaDuracao(int hi, int mi, int hf, int mf)
	{
		int duracao_hora = 0, duracao_minuto = 0;
		if(hf >= hi)
		{
			duracao_hora = hf - hi;
			if(mf >= mi)
			{
				duracao_minuto = mf - mi;
			}
			else if(mi > mf)
			{
				duracao_hora = duracao_hora - 1;
				mi = 60 - mi;
				duracao_minuto = mi + mf;
			}
		}
		else if(hf < hi)
		{
			hi = 24 - hi;
			if(mf >= mi)
			{
				duracao_hora = hi + hf;
				duracao_minuto = mf - mi;
			}
			else if(mi > mf)
			{
				duracao_hora = hi + hf - 1;
				mi = 60 - mi;
				duracao_minuto = mi + mf;
			}
		}
		System.out.printf("Duração da partida: %d:%d", duracao_hora, duracao_minuto);
	}
}
