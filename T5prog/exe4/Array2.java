import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NegativeArraySizeException;
import java.util.*;

public class Array2{
    public static void main(String[] args){
        int n;
        Scanner teclado = new Scanner(System.in);
        try{
        System.out.println("Digite o tamanho do vetor: ");
        n = teclado.nextInt();
        if(n<0)
            throw new NegativeArraySizeException();
        int[] array = new int[n];
        for(int i = 0, a; i<n; i++){
            System.out.println("Digite a posição que deseja inserir: ");
            a = teclado.nextInt();
            if(a < 0 || a >= n)
                throw new ArrayIndexOutOfBoundsException();
            array[a] = teclado.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.println("Posição "+i+": "+array[i]);
        }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Indice do vetor inválido!");
    }
    catch(NegativeArraySizeException e){
        System.out.println("Vetor com tamanho negativo!");
    }
    }
}
