//  ABSTRACT CLASS
// ABSTRACT CLASS CAN HAVE ABSTRACT METHOD AND NORAML METHODS BUT ABSTRACT METHOD ALWAY BE IN ONLY ABSTRACT CLASS ONLY AND ABSTRACT CLASS OBJECT WE CAN NOT CREATE

// INTERFACE CAN HAVE ONLY METHOD DECLARATIONS AND WE  CAN NOT CREATE OBJECT OF INTERFACE 
import java.util.*;

interface A {
  void show();

  void get();
}

class B implements A {
  public void show() {
    System.out.print("this is show");
  }

  public void get() {
    System.out.println("this is get");
  }
}

public class Demo {

  public static void main(String[] args) {

    B obj = new B();

    obj.show();
    obj.get();

  }
}
