import java.util.Scanner;

class Teste5{
	public static void main(String[] args){
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade");
		idade = entrada.nextInt();
		if(idade <18){
			System.out.println("Não pode entrar");
		} else
			System.out.println("Pode entrar");
	}
}
		
		
