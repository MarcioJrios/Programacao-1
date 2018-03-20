import java.util.Scanner;

class T1{
  public static void main(String[] args){
    Medicamento A = new Medicamento();
    Scanner teclado = new Scanner(System.in);
    int n;
    do{
      System.out.println("Escolha uma opção:");
      System.out.println("1: Reajustar preço de venda");
      System.out.println("2: Vender");
      System.out.println("3: Comprar");
      System.out.println("4: Mostrar data de validade");
      System.out.println("0: Sair"
      n = teclado.nextInt();
      switch(n){
        case 1:
          reajustarPrecoVenda();
          break;
        case 2:
          comprar();
          break;
        case 3:
          vender();
          break;
        case 4:
          break;
        default:
          break;
      }
    }

  }
}
