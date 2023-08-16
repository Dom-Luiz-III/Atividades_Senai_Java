import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1;
		int valor2;
		int resposta;
		
			System.out.println("Digite o Primeiro Número: ");
			valor1 = sc.nextInt();
			
			System.out.println("Digite o Segundo Número: ");
			valor2 = sc.nextInt();
			
			sc.close();
		
				resposta = valor1+valor2;
				System.out.println("A soma é: "+resposta);
				
				resposta = valor1-valor2;
				System.out.println("A subtração é: "+resposta);
				
				resposta = valor1*valor2;
				System.out.println("A Multiplicação é: "+resposta);
				
				resposta = valor1/valor2;
				System.out.println("A Divisão é: "+resposta);
		
	}
}