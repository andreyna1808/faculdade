package aula01;
import java.util.Scanner;

public class AtividadeThree {
  public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // O que vai permitir que o usuário digite algo

		System.out.println("Por favor digite o seu palpite"); //O texto que vai aparecer na tela
		float palpite = teclado.nextInt(); // Digitar o numero do palpite inteiro

    while(palpite != 10000){ // Condição caso o palpite seja diferente de 10.000
      if(palpite < 10000){
        System.out.println("Um pouco mais"); // Se for menor é para imprimir isso
      }
      else {
        System.out.println("Um pouco menos"); // Se for maior é para imprimir isso
      }
      System.out.println("Digite seu próximo palpite"); //O texto que vai aparecer na tela
		  palpite = teclado.nextInt(); // Digitar o numero do palpite inteiro
    }
    System.out.println("Palpite correto"); //O texto que vai aparecer na tela
	}
}

//Também seria possível usar em ternário dentro do while