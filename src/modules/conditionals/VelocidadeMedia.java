package modules.conditionals;
import java.util.Scanner;

public class VelocidadeMedia 
{
	public static void main(String[] args) 
	{
		int voltas = 0, tempo = 0;
		float circuito = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de voltas:");
		voltas = in.nextInt();
		System.out.println("Digite a quantidade de metros percorridos:");
		circuito = in.nextFloat();
		System.out.println("Digite a quantidade de minutos gastos:");
		tempo = in.nextInt();
		calculaVelocidadeMedia(voltas, tempo, circuito);
		
		in.close();
	}
	public static void calculaVelocidadeMedia(int v, int t, float c)
	{
		float velocidade_media = 0;
		if(t > 0)
		{
			velocidade_media =(float)(v * c / 1000.0 / (t / 60.0));
			System.out.printf("Velocidade média = %.2f km/h", velocidade_media);
		}
		else
		{
			System.out.println("Tempo não pode ser menor ou igual a 0.");
		}		
	}
}
