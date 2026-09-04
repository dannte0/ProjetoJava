package nomodules.conditionals;
import java.util.Scanner;

public class DuracaoPartida 
{
	public static void main(String[] args) 
	{
		int hi = 0, mi = 0, hf = 0, mf = 0, hh = 0, mm = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		hi = in.nextInt();
		System.out.println("Digite o minuto inicial: ");
		mi = in.nextInt();
		System.out.println("Digite a hora final: ");
		hf = in.nextInt();
		System.out.println("Digite o minuto final: ");
		mf = in.nextInt();
		
		if(hf >= hi)
		{
			hh = hf - hi;
			if(mf >= mi)
			{
				mm = mf - mi;
			}
			else if(mi > mf)
			{
				hh = hh - 1;
				mi = 60 - mi;
				mm = mi + mf;
			}
		}
		else if(hf < hi)
		{
			hi = 24 - hi;
			if(mf >= mi)
			{
				hh = hi + hf;
				mm = mf - mi;
			}
			else if(mi > mf)
			{
				hh = hi + hf - 1;
				mi = 60 - mi;
				mm = mi + mf;
			}
		}

		System.out.printf("Dura��o da partida: %d:%d", hh, mm);
		in.close();
	}
}
