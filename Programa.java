public class Programa{
	public static void main(String[] args){
		Conta minhaConta = new Conta();
		minhaConta.dono = "Marcio";
		minhaConta.numero = 1711100046;
		minhaConta.saldo = 150;
		System.out.println("Dono: "+minhaConta.dono);
		System.out.println("Número: "+minhaConta.numero);
		System.out.println("Saldo: "+minhaConta.saldo);
		
		minhaConta.depositar(800.8);
		System.out.println("Saldo: "+minhaConta.saldo);
		minhaConta.sacar(200);
		System.out.println("Saldo: "+minhaConta.saldo);
	}
}
