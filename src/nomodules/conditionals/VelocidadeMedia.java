package nomodules.conditionals;
import java.util.Scanner;

public class VelocidadeMedia 
{
	public static void main(String[] args) 
	{
		int voltas = 0, tempo = 0;
		float circuito = 0, velocidade_media = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de voltas:");
		voltas = in.nextInt();
		System.out.println("Digite a quantidade de metros percorridos:");
		circuito = in.nextFloat();
		System.out.println("Digite a quantidade de minutos gastos:");
		tempo = in.nextInt();
		
		if(tempo > 0)
		{
			velocidade_media = voltas * circuito / 1000 / (tempo / 60);
			System.out.printf("Velocidade m�dia = %.2f km/h", velocidade_media);
		}
		else
		{
			System.out.println("Tempo n�o pode ser menor ou igual a 0.");
		}
		in.close();
	}
}
