package Atividade03;

public class Atividade03 {
  
  public static void main(String[] arg) {
    Conta c1 = new Conta();

    c1.numero = 120;
		c1.titular = "Andreyna";
		c1.saldo = 2500;
		c1.limite = 3400;

    c1.sacar(1200);
    c1.depositar(500);

    c1.info();
  }
}
