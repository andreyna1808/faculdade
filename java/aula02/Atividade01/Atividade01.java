package Atividade01;

public class Atividade01 {
  public static void main(String[] args) {

		Avaliacao joao = new Avaliacao();
		joao.n1=8;
		joao.n2=9;
		joao.n3=5;
		
		System.out.println("Média Aritmetica do Jõao: " + joao.mediaAritmetica());
		System.out.println("Média Ponderada do Jõao: " + joao.mediaPonderada());
	}
}