// STATIC VARIABLE

import java.util.*;


class Human{
    int age;
    String name;

    public Human( int age , String name)
    {
       this.age=age;
       this.name=name;
    }


    public void getInformation()
    {
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }
}

public class Demo {

    public static void main(String[] args) {
      
       Human h = new Human(24,"fariyad");

       h.getInformation();
        
        
    

    }
}

