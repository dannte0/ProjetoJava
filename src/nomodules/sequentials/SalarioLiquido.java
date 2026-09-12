package nomodules.sequentials;

import java.util.Scanner;

public class SalarioLiquido 
{
	public static void main(String[] args) 
	{
		int horas_trabalhadas = 0, valor_hora = 0, 
		dependentes = 0;
		float desconto = 0, salario_bruto = 0,
		salario_liquido = 0;
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		horas_trabalhadas = in.nextInt();
		System.out.println("Digite o valor pago por hora:");
		valor_hora = in.nextInt();
		System.out.println("Digite o desconto a ser aplicado:");
		desconto = in.nextFloat();
		System.out.println("Digite o número de dependentes:");
		dependentes = in.nextInt();
		salario_bruto = horas_trabalhadas * valor_hora;
		salario_liquido = salario_bruto - (salario_bruto * desconto/100) + dependentes * 100;
	
		System.out.printf("O salário líquido é: R$ %.2f", salario_liquido);
		in.close();
	}
}