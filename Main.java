class Main {
  public static void main(String[] args) {
    Sum s = new Sum(12,13);
    Sub b = new Sub(45,22);
    Multi z = new Multi(2,6);
    Div g = new Div(78,2);

    s.sumOf();
    System.out.println("1.The sum of both numbers equals " + s.sumOf() );

    b.subOf();
    System.out.println("2.The sub of both numbers equals " + b.subOf() );

    g.DivOf();
    System.out.println("3.The Div of both numbers equals " + g.DivOf() );

     z.MultiOf();
    System.out.println("4.The multi of both numbers equals " + z.MultiOf() );

  }
}