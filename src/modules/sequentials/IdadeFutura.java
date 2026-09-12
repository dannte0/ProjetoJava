package modules.sequentials;

import java.util.Scanner;

public class IdadeFutura 
{
	public static void main(String[] args) 
	{
		int ano_nascimento = 0, ano_atual = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento:");
		ano_nascimento = in.nextInt();
		System.out.println("Digite o ano atual:");
		ano_atual = in .nextInt();
		calculaIdade(ano_atual, ano_nascimento);
		
		in.close();
	}
	public static void calculaIdade(int ano_at, int ano_nasc)
	{
		int idade = 0, idade_futura;
		
		idade = ano_at - ano_nasc;
		idade_futura = idade + 17;
		
		System.out.printf("Idade atual: %d\nIdade daqui a 17 anos: %d", idade, idade_futura);
	}
}
