import java.util.*;
class Soma{
	static int somavet(int vet[])throws IntervaloException{
		int a, b, soma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o intervalo que deseja somar?");
		a = teclado.nextInt();
		b = teclado.nextInt();
		 	if(a<0 || a>5 || b<0 || b>5){
				throw new IntervaloException();
		}
		while(a <= b){
			soma += vet[a];
			a++;
		}
		return soma;
	}
}
