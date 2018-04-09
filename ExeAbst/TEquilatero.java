public class TEquilatero extends Triangulo{
  @override
  public double area(){
    this.area = (base*altura)/2;
  }

  public void setBase(int b){
    this.base = b;
  }

  public void setAltura(int a){
    this.altura = a;
  }
}
