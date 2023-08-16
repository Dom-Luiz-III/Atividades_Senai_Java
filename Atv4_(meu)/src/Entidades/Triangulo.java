package Entidades;

public class Triangulo {
	public int A;
	public int B;
	public int C;
	
	public boolean verifica_triangulo() 
	{
		if((A + B > C) && (B + C > A) && (C + A >B )) {
			System.out.println("Os valores formam um triângulo!");
			return true;
		}else {
			System.out.println("Os valores não formam um triângulo!");
			return false;
		}
	}
	
	
	public void tipo_triangulo() 
	{
		if((A == B) && (B == C)){
			System.out.println("Os valores formam um triângulo equilatero!");
		}else if((A != B) && (B != C) && (C != A)){
			System.out.println("Os valores formam um triângulo Escaleno!");
		}else {
			System.out.println("Os valores não formam um triângulo Isósceles!");
		}
	}
}
