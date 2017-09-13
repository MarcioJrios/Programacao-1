public class livro{
	String nome = "Marcio";
	String descricao = "Romance";
	double valor = 25;
	String nomeDoAutor = "Joao";
	String emailDoAutor = "joao@hotmail.com";
	String cpfDoAutor = "11952354960";

	public void mostraDetalhes(){
		System.out.println("Nome do livro: " + nome);
		System.out.println("Descrição do livro: "+ descricao);
		System.out.println("Valor do livro: "+ valor);
		System.out.println("Nome do autor: "+ nomeDoAutor);
		System.out.println("E-mail do autor: "+ emailDoAutor);
		System.out.println("Cpf do autor: "+ cpfDoAutor);
	}
}
