

public class listaLivros{
	public static void main(String[] args){
		//livro lista[] = new livro[3];
		//lista[1] = new
		livro[] lista = new livro[3];
		livro livro1 = new livro();
		lista[0] = livro1;
		lista[1] = livro1;
		lista[2] = livro1;
		for(livro l: lista){
			System.out.println(l.nome);
			System.out.println(l.descricao);
			System.out.println(l.valor);
			System.out.println(l.nomeDoAutor);
			System.out.println(l.emailDoAutor);
			System.out.println(l.cpfDoAutor);
			}
		}
}
			
		
