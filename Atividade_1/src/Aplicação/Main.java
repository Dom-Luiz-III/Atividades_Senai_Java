package Aplicação;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double valor, soma;
		Double jurosFi, jurosBa, jurosDi, jurosEx;
		Double dias, dia2;
		
		System.out.print("Ola!\nInforme o quanto de mensalidade você vai pagar:\n ");
		valor = sc.nextDouble();
		System.out.print("OK!\nAgora, diga-me quantos dias de atraso teve seu pagamento:\n ");
		dias = sc.nextDouble();
		sc.close();
		
			if(dias <= 5) {
				
				System.out.print("Você não teve multas por atraso, o valor será:\n" + valor);
				
			}else if(dias <= 10){
				
				jurosBa = 0.05;
				jurosFi = jurosBa * valor;
				soma = jurosFi + valor;
				
				System.out.print("Você teve multas por atraso, o valor será:\n" + soma);
				
			}if (dias <= 19) {
				
				jurosBa = 0.10;
				jurosFi = jurosBa * valor;
				soma = jurosFi + valor;
				
				System.out.print("Você teve multas por atraso, o valor será:\n" + soma);
				
			}if (dias <= 20 ) {
				
				jurosBa = 0.15;
				jurosFi = jurosBa * valor;
				soma = jurosFi + valor;
				
				System.out.print("Você teve multas por atraso, o valor será:\n" + soma);
								
			}if  (dias > 20) {
				
				jurosBa = 0.15;
				jurosFi = jurosBa * valor;
				
				jurosDi = 0.02;
				dia2 = dias - 20;
				jurosEx = valor * (jurosDi * dia2);
				
				soma = jurosEx + jurosFi + valor;
				
				System.out.print("Você teve multas por atraso, o valor será:\n" + soma);
				
			}else {
				System.out.print("Isso né número não meu fi faz de novo ");
			}
	}

}
