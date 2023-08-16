package Aplicação;

import java.util.Scanner;

import Elementos.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo trianguloX = new Triangulo();
		Triangulo trianguloY = new Triangulo();
		
		System.out.println("Informe as áreas do triângulo X (de A à C):\n");
		trianguloX.ladoA = sc.nextDouble();
		trianguloX.ladoB = sc.nextDouble();
		trianguloX.ladoC = sc.nextDouble();
		System.out.println("Informe as áreas do triângulo Y (de A à C):\n");
		trianguloY.ladoA = sc.nextDouble();
		trianguloY.ladoB = sc.nextDouble();
		trianguloY.ladoC = sc.nextDouble();
		sc.close();
		
		if(trianguloX.calcularArea() > trianguloY.calcularArea()) {
			System.out.println("Triângulo X é maior");
		}
		else {
			System.out.println("Triângulo Y é maior");
		}
	}
}