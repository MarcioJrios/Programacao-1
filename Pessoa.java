public class Pessoa{
	private int idade;
	private float peso;
	private String nome;
	
	public getInfos(){
		System.out.println("Idade: "+ idade +"\nPeso: "+ peso +"\nNome: "+ nome +"\n");
	}
	public setIdade(int idade){
		return this.idade;
	}
	public setPeso(float peso){
		return this.peso;
	}
	public setNome(String nome){
		return this.nome;
	}
}
