import java.util.Scanner;

class T1{
  public static void main(String[] args){
    Laboratorio lab = new Laboratorio();
    Data data = new Data(22, 3, 2020);
    Medicamento A = new Medicamento(lab, data);
    Scanner teclado = new Scanner(System.in);
    int n, quantidade;
    double percentual;
    do{
      System.out.println("Escolha uma opção:");
      System.out.println("1: Reajustar preço de venda");
      System.out.println("2: Comprar");
      System.out.println("3: Vender");
      System.out.println("4: Mostrar data de validade");
      System.out.println("0: Sair");
      n = teclado.nextInt();
      switch(n){
        case 1:
	  System.out.println("Digite o percentual");
	  percentual = teclado.nextDouble();
          A.reajustarPrecoVenda(percentual);
          break;
        case 2:
	  System.out.println("Digite a quantidade a comprar: ");
	  quantidade = teclado.nextInt();
          A.comprar(quantidade);
          break;
        case 3:
	  if(A.receitaObrigatoria = true){
	     System.out.println("Este medicamento so pode ser adquirido com uma Receita Obrigatória");
	     System.out.println("Digite a quantidade a vender: ");
	     quantidade = teclado.nextInt();
             A.vender(quantidade);
		}else{
		   System.out.println("Digite a quantidade a vender: ");
		   quantidade = teclado.nextInt();
		   A.vender(quantidade);
			}
          break;
        case 4:
	  A.mostra();
          break;
	case 0:
	  break;
        default:
	  System.out.println("Opção inválida!");
          break;
      }
    }while(n != 0);

  }
}
