//  2D ARRAY

import java.util.*;

public class Demo {

  public static void main(String[] args) {

    int[][] nums = { { 20, 30, 40, 50 },
        { 4, 5, 3, 3, 6 } };

    for (int[] ele : nums) {
      for (int value : ele)
        System.out.print(value);
      System.out.println();
    }

  }
}
