import java.util.Scanner;
public class trabalho2{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		Conta2 conta1 = new Conta2();
		Conta2 conta2 = new Conta2();
		double VDeposito;
		double VSaque;
		do{
			System.out.println("Escolha uma opção:");
			System.out.println("1:Consultar Saldo");
			System.out.println("2:Efetuar Saque");
			System.out.println("3:Efetuar Deposito");
			System.out.println("4:Efetuar transferencia");
			System.out.println("5:Exibit dados da conta");
			int b;
			b = entrada.nextInt();
			switch(b){
				case 1:
					System.out.println("Saldo atual: " + conta1.Saldo);
					break;
				case 2:
					if(conta1.Saldo <=0)
						System.out.println("Saldo zerado");
					System.out.println("Digite o valor a ser sacado:");
					VSaque = entrada.nextInt();
					if(VSaque > conta1.Saldo)
						System.out.println("Valor digitado maior do que o saldo");
					else
						conta1.Saldo = conta1.Saldo - VSaque;
					break;
				case 3:
					System.out.println("Digite o valor a ser depositado:");
					VDeposito = entrada.nextInt();
					conta1.Saldo = conta1.Saldo + VDeposito;
					break;
				case 4:
					conta2.Saldo = conta1.Saldo;
					conta2.Nome = conta1.Nome;
					conta2.Cod = conta1.Cod;
					break;
				case 5:
					System.out.println("Nome do titular da conta: "+conta1.Nome);
					System.out.println("Código da conta: "+conta1.Cod);
					System.out.println("Saldo da conta :"+conta1.Saldo);
					break;
				case 0:
					break;
				default:
					System.out.println("Opção invalida!");
					break;}
				}while (b != 0);
		}
}
