class Bhaskara{
  int a;
  int b;
  int c;

  Bhaskara(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;

  }

  void imprimeRaizes(){
    double x;
    double xx;
    x = ((-b) - Math.sqrt((b*b)-4*a*c))/2*a;
    xx = ((-b) + Math.sqrt((b*b)-4*a*c))/2*a;
    System.out.println("x = " +x);
    System.out.println("x = " +xx);
  }
}
