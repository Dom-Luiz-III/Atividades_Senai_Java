/*
Atividade 1

Faça um programa para ler a cotação do dólar, e depois um valor em
dólares a ser comprado por uma pessoa em reais. 
Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que
pagar 6% de IOF sobre o valor em dólar. Criar uma classe DolarConvert
para ser responsável pelos cálculos.
 */

package aplicacao;

import java.util.Scanner;
import calculadora.DolarConvert;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DolarConvert dados = new DolarConvert();
		
		System.out.println("Ola!\nA cotação do Dólar nesse momento está a R$5,15.\n\nInforme quanto Dólares você quer comprar: ");
		dados.valor = sc.nextDouble();
		sc.close();
		
		dados.Conversor();
	}

}
