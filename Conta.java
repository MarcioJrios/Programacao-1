public class Conta{
	int numero;
	String dono;
	double saldo;

	public void depositar(double valor){
		this.saldo += valor;
		}
	public void sacar(double valor){
		this.saldo -= valor;
		}
}
