package qa.guru;

public class primitiveDataTypesExercise {

  public static void primitiveDataTypesSimpleExamples() {

    byte byteValue = 115; //(-128 to +127)
    short shortValue = 28923; //(-32 768 to +32 767);
    int intValue = -147_483_647; //int (-2 147 483 648 to +2 147 483 647 )
    long longValue = 7_233_371_036_854_775_808L;  //(-9 223 372 036 854 775 808 to +9 223 372 036 854 775 807)
    float floatValue = 445F; //(1.40e-45 to 3.40e+38)
    double doubleValue = 332.99; //(4.9e-324 to 1.8e+308)
    char charValue = 'a'; //(min «\u0000» (or 0) max  «\uffff» (or 65535 inclusive))
    boolean booleanValue = true; //(can be true or false.)

    System.out.println("Example of byte: " + byteValue);
    System.out.println("Example of short: " + shortValue);
    System.out.println("Example of int: " + intValue);
    System.out.println("Example of long: " + longValue);
    System.out.println("Example of float: " + floatValue);
    System.out.println("Example of double: " + doubleValue);
    System.out.println("Example of char: " + charValue);
    System.out.println("Example of boolean: " + booleanValue);
    System.out.println();
  }

  public static void arithmeticOperations() {
    int a = 10;
    int b = 20;
    double c = 30;
    double d = 40;
    int result = ++a;
    double result2 = d--;
    System.out.println(a + b);
    System.out.println(b - a);
    System.out.println(c + d);
    System.out.println(d - c);
    System.out.println(a * c);
    System.out.println(d / b);
    System.out.println(result);
    System.out.println(result2);
    System.out.println();
  }

  public static void stackOverflow() {
    int intMax = 2_147_483_647;
    System.out.println(intMax + 1);
    //(int overflow max)

    short shortMin = -32768;
    System.out.println(shortMin - 1);
    //(int overflow min)

    long longMax = 9_223_372_036_854_775_807L;
    System.out.println(longMax + 1);
  }


  public static void whatShouldIWear() {
    double temperature = 0;
    if
    (temperature < 15) {
      System.out.println("Cold enough to wear a coat");
    } else if ((temperature < 20)) {
      System.out.println("Cold enough to wear a jacket");
    } else {
      System.out.println("No outerwear required!");
    }
    //just to demonstrate if else construction
  }

  public static boolean between5and50(int number) {

    return (number >= 5) && (number <= 50);

    //* Check that input integer belongs to the segment 5 to 50 (inclusive).
  }

  public static void main(String[] args) {
    primitiveDataTypesSimpleExamples();
    arithmeticOperations();
    stackOverflow();
    whatShouldIWear();
    between5and50(10);

  }
}


