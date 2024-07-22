// This keyword is  remaining to study

import java.util.*;


class Human{
    int age;
    String name;
    
     public Human( int age , String name)
     {
        this.age=age;
        this.name=name;


     }
   
   

 
  public int getAge()
{
    return age;
}
public String getName()
{
    return name;
}



    
}

public class Demo {

    public static void main(String[] args) {
      
       Human h = new Human(12,"fariyad");
      

        System.out.print("age is " +h.getAge());
        System.out.print("age is " +h.getName());
        
    

    }
}

