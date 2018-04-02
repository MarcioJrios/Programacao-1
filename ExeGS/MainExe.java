import java.util.*;

public class MainExe{
  public static void main(String[] args){
    ArrayList<Pessoa> pessoas = new ArrayList();
    Scanner teclado = new Scanner(System.in);
    String nome;
    int idade;
    float peso;
    int n;
    do{
      System.out.print("Digite a opção desejada:\n");
      System.out.println("1: Cadastrar pessoa");
      System.out.println("2: Mostrar pessoas");
      System.out.println("0: Sair");
      n = teclado.nextInt();
      switch(n){
        case 1:
          Pessoa Person = new Pessoa();
          nome = teclado.nextLine();
          idade = teclado.nextInt();
          peso = teclado.nextFloat();
          Person.setIdade(idade);
          Person.setNome(nome);
          Person.setPeso(peso);
          pessoas.add(Person);
          break;
        case 2:
          for(int i = 0; i < pessoas.size(); i++){
            Pessoa p = pessoas.get(i);
              System.out.println("Dados Bodegueiro [" +(i+1)+ "]" + p);
                }
          break;
        case 0:
          break;
        default:
          System.out.println("Opção inválida");
          break;
        }

    }while(n != 0);
  }
}
