package Entidades;

public class Triangulo {
	public int A;
	public int B;
	public int C;
	
	public boolean verifica_triangulo() {
		if((A + B > C) && (B + C > A) && (C + A > B)) {
			System.out.println("Os valores formam um triangulo!");
			return true;
		}
		else {
			System.out.println("Os valores NÃO formam um triangulo!");
			return false;
		}
	}
	
	public void tipo_triangulo() {
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
