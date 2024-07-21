// This keyword is  remaining to study

import java.util.*;


class Human{
    int age;
    String name;

   
   public void setAge(int age)
   {
       this.age=age;
   }

 public void setName(String name)
 {
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
      
       Human h = new Human();
       h.setAge(34);
       h.setName("fariyad");

        System.out.print("age is " +h.getAge());
        System.out.print("age is " +h.getName());
        
    

    }
}

