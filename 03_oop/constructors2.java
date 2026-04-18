public class constructors2 {
  int modelYear;
  String modelName;

  public constructors2(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    constructors2 myCar = new constructors2(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}