//  ABSTRACT CLASS
// ABSTRACT CLASS CAN HAVE ABSTRACT METHOD AND NORAML METHODS BUT ABSTRACT METHOD ALWAY BE IN ONLY ABSTRACT CLASS ONLY AND ABSTRACT CLASS OBJECT WE CAN NOT CREATE

// INTERFACE CAN HAVE ONLY METHOD DECLARATIONS AND WE  CAN NOT CREATE OBJECT OF INTERFACE 
import java.util.*;
interface A{
  int  add(int x,int y);
}



public class Demo {

  public static void main(String[] args) {

    A obj= (x,y)-> x+y;
    
    
      
    
    int result = obj.add(10,20);
    System.out.print("sum is "+result);
   
  }
}
