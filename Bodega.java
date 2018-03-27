import java.util.*;

public class Bodega{
	public static void main(String[] args){
		ArrayList<Funcionario> bodegueiros = new ArrayList<>();
		ArrayList<Bebida> produtos = new ArrayList<>();
		ArrayList<Cliente> fregueses = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		Empresa bodega = new Empresa("Bodega do Jão", "788873872/123", "Joãozinho");
		bodegueiros.add(new Funcionario("José", "01598746988", "09/03/69", "Gerente", 2500.90));
		bodegueiros.add(new Funcionario("Carlos", "74398723454", "05/12/76", "Caixa", 1900.00));
		bodegueiros.add(new Funcionario("Priscila", "42282448790", "04/06/90", "Garçonete", 1700.00));
		Funcionario reff = new Funcionario();
		produtos.add(new Bebida("Vodka Skyy", 39.90, "39%", 900, 10));
		produtos.add(new Bebida("Velho Barreiro", 9.90, "40%", 750, 5));
		produtos.add(new Bebida("Skol Beats LongNeck", 4.99, "7,6%", 355, 24));
		Bebida refb = new Bebida();
		fregueses.add(new Cliente("Marcio", "10456409245", true));
		fregueses.add(new Cliente("Kirito", "52420742272", false));
		fregueses.add(new Cliente("Karling", "02729528571", true));
		Cliente refc = new Cliente();

		int x;
		do{
			System.out.print("\tDigite a opção desejada:\n");
			System.out.print("\t1 - Contratar Funcionario\n");
			System.out.print("\t2 - Cadastrar Bebida\n");
			System.out.print("\t3 - Cadastrar Cliente\n");
			System.out.print("\t4 - Veder Bebida\n");
			System.out.print("\t5 - Comprar Bebida\n");
			System.out.print("\t6 - Conferir Estoque\n");
			System.out.print("\t7 - Exibir Bebidas\n");
			System.out.print("\t8 - Exibir Clientes\n");
			System.out.print("\t9 - Exibir Funcionarios\n");
			System.out.print("\t0 - Sair\n");
			x = entrada.nextInt();
		switch(x){
			case 1:
				bodegueiros.add(bodega.contrata());
				break;
			case 2:
				produtos.add(bodega.cadastraBebida());
				break;
			case 3:
				fregueses.add(bodega.cadastraCliente());
				break;
			case 4:
				refb.venda(produtos);
				break;
			case 5:
				refb.compra(produtos);
				break;
			case 6:
				refb.estoque(produtos);
				break;
			case 7:
				bodega.mostraBeb(produtos);
				break;
			case 8:
				bodega.mostraCli(fregueses);
				break;
			case 9:
				bodega.mostraFun(bodegueiros);
				break;
			case 0:
				break;
			default:
				System.out.println("Opção invalida!");
				break;
			}
		}while(x != 0);
	}
}
