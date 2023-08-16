/*
Atividade 3

Fazer um programa para ler o nome de um aluno e as três notas que ele
obteve nos três trimestres do ano (primeiro trimestre vale 3.0 e o segundo e
terceiro valem 3.5 cada). Ao final, mostrar qual a nota final do aluno no ano.
Dizer também se o aluno está APROVADO ou REPROVADO e, em caso
negativo, quantos pontos faltam para o aluno obter o mínimo para ser
aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema. 
*/

package Aplicacao;

import java.util.Scanner;

import Util.Student;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		System.out.println("Ola!\nInforme o seu nome como aluno: ");
		aluno.nome = sc.next();
		System.out.println("Informe a primeira nota (a que vale 3,0 pontos): ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota (a que vale 3,5): ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota (a que vale 3,5): ");
		aluno.nota3 = sc.nextDouble();

		aluno.calcular_media();
		sc.close();
	}

}