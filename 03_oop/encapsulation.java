public class encapsulation {
    private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }    
}

class Person{
    public static void main(String[] args) {
        encapsulation e1 = new encapsulation();
        e1.setName("Hrithik");
        System.out.println(e1.getName());
    }
}

//Encapsulation:- hide sensitive data from users.
//To achieve that we use "getters" & "setters" to update the value of "private" variable
 