class Medicamento{
  String nome;
  double precoVenda;
  Data dataValidade;
  Laboratorio laboratorio;
  boolean receitaObrigatoria;
  int qtdEstoque;

  Medicamento(Laboratorio lab){
	this.nome = "Dorflex";
	this.precoVenda = 10;
	this.dataValidade.dia = 22;
	this.dataValidade.mes = 3;
	this.dataValidade.ano = 2020;
	this.laboratorio = lab;
	this.receitaObrigatoria = false;
	this.qtdEstoque = 12;
  }

  void reajustarPrecoVenda(double percentual){
	percentual = percentual / 100;
	this.precoVenda = this.precoVenda * percentual;
	
  }

  void vender(int quantidade){
	this.qtdEstoque = this.qtdEstoque - quantidade;

  }

  void comprar(int quantidade){
	this.qtdEstoque = this.qtdEstoque + quantidade;
	

  }

  void mostra(){
  }
}
