class Calculator
{
   public int add(int n1, int n2, int n3)
   {
      return n1+n2+n3;
   }
   public int add(int n1, int n2)
   {
      return n1+n2;
   }
   public double add(double n1, int n2)
   {
      return n1+n2;
   }
}

public class MethodOverloading
{
    public static void main(String a[])
    {
        Calculator calc = new Calculator();
        int r1 = calc.add(2,3,5);
        int r2 = calc.add(5,9);
        double r3 = calc.add(5.83,4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}