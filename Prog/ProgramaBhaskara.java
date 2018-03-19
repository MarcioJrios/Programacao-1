import java.lang.Math;
import java.util.Scanner;

class ProgramaBhaskara{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int a, b, c;
    a = teclado.nextInt();
    b = teclado.nextInt();
    c = teclado.nextInt();
    Bhaskara B = new Bhaskara(a, b, c);
    B.imprimeRaizes();

  }
}
