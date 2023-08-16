package Aplicacao;

import java.util.Scanner;

import Entidades.Triangulo;
import Entidades.utilTriangulo;

public class Main {
	public static void main(String[] args) {
		int v1, v2, v3;
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		v1 = input.nextInt();
		System.out.println("Informe o segundo valor: ");
		v2 = input.nextInt();
		System.out.println("Informe o terceiro valor: ");
		v3 = input.nextInt();
	
		if(utilTriangulo.verifica_triangulo(v1, v2, v3)) {
			utilTriangulo.tipo_triangulo(v1, v2, v3);
		}
	}
	/*
	public static boolean verifica_triangulo(int A, int B, int C) {
		if((A + B > C) && (B + C > A) && (C + A > B)) {
			System.out.println("Os valores formam um triangulo!");
			return true;
		}
		else {
			System.out.println("Os valores NÃO formam um triangulo!");
			return false;
		}
	}
	
	public static void tipo_triangulo(int A, int B, int C) {
		if ((A == B) && (B == C)) {
			System.out.println("Os valores formam um triangulo Equilátero!");
		}
		else if((A != B) && (B != C) && (C != A)) {
			System.out.println("Os valores formam um triangulo Escaleno!");
		}
		else {
			System.out.println("Os valores formam um triangulo Isósceles!");
		}
	}
	*/
}
