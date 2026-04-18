public class methods {
  static String myMethod() {
    System.out.println("Hello World!");
    return "Method executed";
  }

  public static void main(String[] args) {
    String result = myMethod();
    System.out.println(result);
  }
}