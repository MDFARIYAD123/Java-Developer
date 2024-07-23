// This keyword is  remaining to study

import java.util.*;



class Cal{
    public int add(int x , int y)
    {
        return x+y;
    }
    public int sub(int x, int y)
    {
        return x-y;
    }


}


public class Demo {

    public static void main(String[] args) {
      
       Cal c = new Cal();

        int result1=c.add(12,334);
       int result2 =c.sub(34,98);
      
   System.out.println("sum is "+result1);
   System.out.println("sub is "+result2);
        
        
        
    

    }
}

