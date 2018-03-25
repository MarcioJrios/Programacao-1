class Medicamento{
  String nome;
  double precoVenda;
  Data dataValidade;
  Laboratorio laboratorio;
  boolean receitaObrigatoria;
  int qtdEstoque;

  Medicamento(Laboratorio lab, Data data){
	this.nome = "Dorflex";
	this.precoVenda = 10;
	this.dataValidade = data;
	this.laboratorio = lab;
	this.receitaObrigatoria = true;
	this.qtdEstoque = 12;
  }

  void reajustarPrecoVenda(double percentual){
	percentual = percentual / 100;
	this.precoVenda = this.precoVenda + (this.precoVenda * percentual);
	
  }

  void vender(int quantidade){
	this.qtdEstoque = this.qtdEstoque - quantidade;

  }

  void comprar(int quantidade){
	this.qtdEstoque = this.qtdEstoque + quantidade;
	

  }

  void mostra(){
	System.out.println("Nome do produto: "+this.nome);
	System.out.println("Preço: "+this.precoVenda);
	System.out.println("Nome do Laboratorio: "+this.laboratorio.nomeFantasia);
	System.out.println("Receira Obrigatoria: "+this.receitaObrigatoria);
	System.out.println("Quantidade no Estoque: "+this.qtdEstoque);
	String data = ""+this.dataValidade.dia+"/"+this.dataValidade.mes+"/"+this.dataValidade.ano;
	System.out.println("Data de validade: "+data+"\n");
  }

}
