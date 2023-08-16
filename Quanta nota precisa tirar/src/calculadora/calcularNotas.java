package calculadora;

public class calcularNotas {
	public static final double p_av1 = 0.25;
	public static final double p_av2 = 0.35;
	public static final double p_av3 = 0.40;
	public static final double media = 7;
	
	public static void calcular_av3(double n1, double n2) {
		double n3 = (media - (n1 * p_av1 + n2 * p_av2)) / p_av3;
		System.out.println("Você precisa tirar: " + n3);
	}
}
