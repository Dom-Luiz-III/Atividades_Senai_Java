package calculadora;

public class DolarConvert {
	public double valor;
	public static double dolar = 5.15;
	public static double IOF = 0.6;
	
	public void Conversor() {
		double soma = valor * dolar;
		double total = (soma * IOF) + soma;
		
		System.out.printf("O valor de conversão será: %.2f\nCom IOF incluso você pagará: %.2f",soma,total);

	}
}
