package nomodules.sequentials;

import java.util.Scanner;

public class IdadeFutura 
{
	public static void main(String[] args) 
	{
		int ano_nascimento = 0, ano_atual = 0,
		idade = 0, idade_futura;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento:");
		ano_nascimento = in.nextInt();
		System.out.println("Digite o ano atual:");
		ano_atual = in .nextInt();
		idade = ano_atual - ano_nascimento;
		idade_futura = idade + 17;
		
		System.out.printf("Idade atual: %d\nIdade daqui a 17 anos: %d", idade, idade_futura);
		in.close();
	}
}
