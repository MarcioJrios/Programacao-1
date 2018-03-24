import java.util.Scanner;

class T1{
  public static void main(String[] args){
    Laboratorio lab = new Laboratorio();
    Medicamento A = new Medicamento(lab);
    Scanner teclado = new Scanner(System.in);
    int n;
    do{
      System.out.println("Escolha uma opção:");
      System.out.println("1: Reajustar preço de venda");
      System.out.println("2: Vender");
      System.out.println("3: Comprar");
      System.out.println("4: Mostrar data de validade");
      System.out.println("0: Sair");
      n = teclado.nextInt();
      switch(n){
        case 1:
	  double percentual;
	  System.out.println("Digite o percentual");
	  percentual = teclado.nextDouble();
          A.reajustarPrecoVenda(percentual);
          break;
        case 2:
	  int quantidade2;
	  quantidade2 = teclado.nextInt();
          A.comprar(quantidade2);
          break;
        case 3:
	  int quantidade1;
	  quantidade1 = teclado.nextInt();
          A.vender(quantidade1);
          break;
        case 4:
          break;
        default:
          break;
      }
    }while(n != 4);

  }
}
