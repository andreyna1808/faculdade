package aula01;
import java.util.Scanner;

public class AtividadeTwo {
  public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // O que vai permitir que o usuário digite algo

		System.out.println("Por favor digite o seu peso em (kg)"); //Kg que irá aparecer em usuário
		float peso = teclado.nextFloat(); // Digitar o peso

		System.out.println("Por favor digite a sua altura (m)"); //Cm que irá aparecer para o usuário
		float altura = teclado.nextFloat(); // Digitar a altura

		float imc = peso / (altura * altura); // Cálculo do IMC

		System.out.printf("Seu IMC é: %.2f", imc); //Resposta que vai aparecer para o usuário
		// usando o printf será possível usar o %.2f para por um limite de dois após a virgula.
	}
}
