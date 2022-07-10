package Atividade02;

public class Aluno {
  String nome;
  String curso;

  public Aluno(String nome, String curso) {
    this.nome = nome;
    this.curso = curso;
  }

  void info() {
    System.out.println("Nome: "+ nome);
    System.out.println("Curso: "+ curso);
  }

}
