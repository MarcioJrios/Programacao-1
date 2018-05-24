import java.util.*;

public class Matematica{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    double a, b, c;
    int n;

    try{
    System.out.println("Digite o primeiro valor: ");
    a = teclado.nextDouble();
    if(a == 0)
      throw new ParamZeroException();
    System.out.println("Digite o segundo valor: ");
    b = teclado.nextDouble();
    if(b == 0)
      throw new ParamZeroException();

    do{
      System.out.println("Digite a opção desejada");
      System.out.println("1: Soma");
      System.out.println("2: Subtração");
      System.out.println("3: Divisão");
      System.out.println("4: Multiplicação");
      n  = teclado.nextInt();
      switch(n){
        case 1:
          c = somar(a, b);
          System.out.println("R: "+c);
          break;
        case 2:
          c = subtrair(a, b);
          System.out.println("R: "+c);
          break;
        case 3:
          c = dividir(a, b);
          System.out.println("R: "+c);
          break;
        case 4:
          c = multiplicar(a, b);
          System.out.println("R: "+c);
          break;
        default:
          System.out.println("Opção inválida");
      }
    }while(n!=0);

  }catch(ParamZeroException me){
    System.out.println("Valor digitado igual a 0!\n");
  }
  catch(ResultadoZeroException me){
    System.out.println("Resultado da soma igual a 0!\n");
  }

}
    public static double somar(double a, double b) throws ParamZeroException, ResultadoZeroException{
        if(a + b == 0)
          throw new ResultadoZeroException();
      return a + b;
    }

    public static double subtrair(double a, double b)throws ParamZeroException, ResultadoZeroException{
        if(a - b == 0)
          throw new ResultadoZeroException();
        return a - b;
    }

    public static double dividir(double a, double b)throws ParamZeroException, ResultadoZeroException{
      if(a / b == 0)
        throw new ResultadoZeroException();
      return a / b;
    }

    public static double multiplicar(double a, double b)throws ParamZeroException, ResultadoZeroException{
        if(a * b == 0)
          throw new ResultadoZeroException();
        return a * b;
    }
}
