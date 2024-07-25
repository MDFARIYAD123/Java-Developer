//  object of array

import java.util.*;

class Human {
  public int x = 10;
  public int y = 887;

}

public class Demo {

  public static void main(String[] args) {

    Human h1 = new Human();
    Human h2 = new Human();
    Human h3 = new Human();
    Human[] arr = new Human[3];
    arr[0] = h1;
    arr[1] = h2;
    arr[2] = h3;

    for (Human value : arr) {
      System.out.println(value.x);
      System.out.println(value.y);
    }

  }
}
