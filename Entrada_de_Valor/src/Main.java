import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int dias;
		int resposta;
		
			System.out.println("Olá!\nDigite o valor da mensalidade que você vai pagar:\n");
			valor = sc.nextInt();
			
			System.out.println("Quantos dias de atraso teve o pagamento?:\n ");
			dias = sc.nextInt();
			
			sc.close();
			
				if( dias == 5 ) {
					System.out.println("O valor que você irá pagar é:\n"+valor);
				}
		
	}
}