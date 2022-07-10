package aula01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeFour {
  public static void main(String[] args) {
    String msg;
    Scanner teclado = new Scanner(System.in);

    ArrayList<String> nomes = new ArrayList();

    System.out.println("Digite quantos nomes ira inserir");
    int total = teclado.nextInt();

    for(int i = 0; i < total; i++){
      System.out.println("Digite o nome de numero: " + (i+1));
      msg = teclado.next();
      nomes.add(msg);
    }

    System.out.println("Seu array de nomes criado: "+ nomes);

    Collections.reverse(nomes);
    System.out.println("Ordem inversa: "+ nomes);
  }
}

/*     System.out.println("Ordem normal");
    for(String i : nomes){ //Para cada nome conforme o index no array nome
      System.out.println(i); //Vai imprimir esse nome de maneira individuar e sair do array
    }
 */
