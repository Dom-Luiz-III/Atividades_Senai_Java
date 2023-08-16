package aplicacao;

import java.util.Scanner;

import calculadora.calcularNotas;

public class Main {

	public static void main(String[] args) {
		double n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da Nota 1: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o valor da Nota 2: ");
		n2 = sc.nextDouble();
		
		calcularNotas.calcular_av3(n1, n2);
		sc.close();
		
	}

}

