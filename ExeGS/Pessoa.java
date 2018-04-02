public class Pessoa{
  private int idade;
  private float peso;
  private String nome;

  public int getIdade(){
    return this.idade;
  }
  public void setIdade(int i){
    this.idade = i;
  }
  public float getPeso(){
    return this.peso;
  }
  public void setPeso(float p){
    this.peso = p;
  }
  public String getNome(){
    return this.nome;
  }
  public String setNome(String n){
    this.nome = n;
  }

  public String getInfos(){
    return "\n\nNome: "+this.nome+"\nIdade: "+this.idade+"\nPeso: "+this.peso+"\n\n";
  }
  
}
