package Entidades;

public class utilTriangulo {
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
}
