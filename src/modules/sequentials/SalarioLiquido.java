package modules.sequentials;

import java.util.Scanner;

public class SalarioLiquido 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		calculaSalarioLiquido(calculaSalarioBruto(in),  in);
	
		in.close();
	}
	
	public static float calculaSalarioBruto(Scanner in)
	{
		System.out.println("Digite a quantidade de horas trabalhadas:");
		int horas_trabalhadas = in.nextInt(); 
		System.out.println("Digite o valor pago por hora:");
		int valor_hora = in.nextInt(); 
		float salario_bruto = horas_trabalhadas * valor_hora;
		
		return salario_bruto;
	}
	public static void calculaSalarioLiquido(float sb, Scanner in)
	{
		System.out.println("Digite o desconto a ser aplicado:");
		float desconto = in.nextFloat();
		System.out.println("Digite o número de dependentes:");
		int dependentes = in.nextInt();
		float salario_liquido = sb - (sb * desconto/100) + dependentes * 100;
		
		System.out.printf("O salário líquido é: R$ %.2f", salario_liquido);
	}
}