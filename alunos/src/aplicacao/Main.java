package aplicacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] alunos = new String[3];
		
		alunos[0] = "Yasmin";
		alunos[1] = "Lucas";
		alunos[2] = "Cristiano";
		
		while (true) {
			try {
				System.out.println("Informe o indice do aluno que deseja buscar: ");
				int index = input.nextInt();
					
					System.out.println("-------------------------------------------------");
					System.out.println("O aluno selecionado foi: " + alunos[index]);
					break;
				}
			
			catch (IndexOutOfBoundsException ex) {
				System.out.println("INDEX INFORMADO NÃO EXISTE!");
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("COMANDO INVALIDO!");
			}
		input.nextLine();
		}
	input.close();
	}
}


//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//at aplicacao.Main.main(Main.java:20)