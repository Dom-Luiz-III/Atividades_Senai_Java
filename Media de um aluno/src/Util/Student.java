package Util;

import javax.swing.Spring;

public class Student {
	
	public CharSequence nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public static final double TRI1 = 0.25;
	public static final double TRI2 = 0.35;
	public static final double P_AV3 = 0.40;
	public static final double MEDIA = 7.0;
	
	public static void calcular_media() 
	{
		double media = (nota1 + nota2 + nota3);
		

		System.out.printf("Na sua 3° prova você precisa tirar: %.2f");
		
	}
}
