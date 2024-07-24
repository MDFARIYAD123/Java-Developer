// METHOD OVERRIDING

import java.util.*;

class A{

    public void show()
    {
        System.out.println("in  A  Show");
    } 
    
    
    




}

class B extends  A{

    public void show()
    {
        System.out.println("in B Show");
    }
    
    

}


public class Demo {

    public static void main(String[] args) {
      
       B obj = new B();

       obj.show();




      
  


        
        
        
    

    }
}

