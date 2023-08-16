package Aplicacao;

import java.util.Scanner;

import Entidades.Triangulo;

public class Main {

	public static void main(String[] args) {
		int v1,v2,v3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:\n");
		v1 = input.nextInt();
		System.out.println("Informe o segundo valor:\n");
		v2 = input.nextInt();
		System.out.println("Informe o terceiro valor:\n");
		v3 = input.nextInt();
	
		Triangulo T1 = new Triangulo();
		T1.A = v1;
		T1.B = v2;
		T1.C = v3;
		
		if(T1.verifica_triangulo()) {
			T1.tipo_triangulo();
		}
	}
}
