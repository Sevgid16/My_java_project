public class Square{
  public static void printSquare(int x){
    System.out.println(x*x);
  }
  public static void main(String args[]){
    int value = 2;
    printSquare(value);
    printSquare(3);
    printSquare(value*2);
    printArea(2,4);
    printArea(8,9);
    System.out.println(square(5));
    System.out.println(square(8));
    test(8);
    test (5);

  }
  // Multiple parameters
  public static void printArea(int x,int y){
    System.out.println(x*y);
  }
// return values
  public static double square(double x){
    return x*x;
  }
  // if statement
  public static void test(int x){
    if (x > 5){
      System.out.println( x + " is > 5");
    }
  }

}