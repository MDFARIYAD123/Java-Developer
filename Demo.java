// This is inheritance 

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

class AdvanceCal extends Cal{

    public int mul(int x, int y)
    {
        return x*y;
    }
    public int div(int x, int y)
    {
        return x/y;
    }


}


public class Demo {

    public static void main(String[] args) {
      
       AdvanceCal c = new AdvanceCal();

        int result1=c.add(12,334);
       int result2 =c.sub(34,98); 
       
       
       int result3 =c.mul(34,98); 
       int result4 =c.div(34,98);


      
   System.out.println("sum is "+result1);
   System.out.println("sub is "+result2);
   System.out.println("mul is "+result3);
   System.out.println("div is "+result4);


        
        
        
    

    }
}

