//  ABSTRACT CLASS
// ABSTRACT CLASS CAN HAVE ABSTRACT METHOD AND NORAML METHODS BUT ABSTRACT METHOD ALWAY BE IN ONLY ABSTRACT CLASS ONLY AND ABSTRACT CLASS OBJECT WE CAN CREATE

import java.util.*;

abstract class Car {
  public abstract void drive();

  public void playMusic() {
    System.out.println("Playing music");
  }
}

class Wagonar extends Car {
  public void drive() {
    System.out.println("driving a car in wagonar");
  }
}

public class Demo {

  public static void main(String[] args) {

    Wagonar w = new Wagonar();
    w.drive();
    w.playMusic();

  }
}
