package Aplicacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Triângulo X*/ double x1,x2,x3,areax,px;
		/*Triângulo Y*/ double y1,y2,y3,areay,py;

		
		System.out.println("Informe as áreas do triângulo X (de A à C):\n");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		x3 = sc.nextInt();
		
		System.out.println("Agora, as áreas do triângulo Y (de A à C):\n");
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		y3 = sc.nextInt();
		sc.close();
		
		px = (x1 + x2 + x3)/2;
		areax = Math.sqrt(px*(px-x1)*(px-x2)*(px-x3));
		
		py = (y1 + y2 + y3)/2;
		areay = Math.sqrt(py*(py-y1)*(py-y2)*(py-y3));
		
		if (areax > areay) {
			System.out.println("O triângulo X é maior, tendo:\n"+areax);
		}
		else { 
			System.out.println("O triângulo Y é o maior, tendo:\n"+areay);
		}
		
	}

}

