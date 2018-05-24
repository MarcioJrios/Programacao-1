import java.util.*;
class Main{
	public static void main(String[] args) {
		int vet[] = new int[5];
		int soma = 0, zero = 0;
		Scanner teclado = new Scanner(System.in);
		Soma m = new Soma();
		System.out.println("Digite os valores do vetor: ");
		try{
			for(int i = 0; i<5; i++){
				vet[i] = teclado.nextInt();
			}
			for(int i = 0; i<5; i++){
				if(vet[i] == 0)
				zero++;
				if(zero == 5){
					throw new VetorVazioException();
				}
			}
			soma = m.somavet(vet);
			System.out.println("Soma do Intervalo:"+soma);
		}
		catch(VetorVazioException e){
			System.out.println("Vetor preenchido com zeros");
		}
		catch(IntervaloException e){
			System.out.println("Intervalo invalido");
		}
	}
}
