package Elementos;

public class Triangulo {
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double calcularArea() {
	double p, resultado;
	
	p = (ladoA + ladoB + ladoC)/2;
	return resultado = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
}
}