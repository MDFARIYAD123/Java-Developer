// STATIC VARIABLE

import java.util.*;

class Mobile{
    

    public void show()
    {
        System.out.println("this is non statidc method");
    }

    public static void show1()
    {
        System.out.println("this is statidc method");
    }
}

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
      Mobile m = new Mobile();
      m.show();
      Mobile.show1();
       
        
        
    

    }
}

