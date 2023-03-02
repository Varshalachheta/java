public class Casting
{
    public static void main (String [] args){
  // Implicit 

  double price = 14.9;
  double finalprice = price + 18;
  System.out.println(finalprice);

  // Explicit 

  int p = 10;
  int fp = p + (int)18.0;
  System.out.println(fp);

}
}