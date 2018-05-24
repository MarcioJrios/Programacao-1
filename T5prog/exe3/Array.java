import java.lang.NegativeArraySizeException;
import java.util.*;

public class Array{
    public static void main(String[] args){
        int n;
        Scanner teclado = new Scanner(System.in);
        try{
        System.out.println("Digite o tamanho do vetor: ");
        n = teclado.nextInt();
        if(n<0)
            throw new NegativeArraySizeException();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Posição "+i+":");
            array[i] = teclado.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.println("Posição "+i+": "+array[i]);
        }
    }catch(NegativeArraySizeException e){
        int[] array = new int[1];
        System.out.println("Vetor com tamanho negativo! Preencha com um valor: ");
        int a = teclado.nextInt();
        array[0] = a;
        System.out.println("Posição 0: "+array[0]);
    }
    }
}
