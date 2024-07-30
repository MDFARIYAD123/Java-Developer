import java.util.*;

class Collection{
    public static void main(String []args)
    {
      
       
//        Set<String> list = new TreeSet<>();
//        list.add("apple");
//        list.add("mago");
//        list.add("egg");
//        list.add("sona");
       

//    list.remove("egg");
        
//         for (String ele : list) {
//             System.out.println(ele);
//         }


   // HASHAMP
   Map<Integer,String>mp = new HashMap<>();

   mp.put(1,"fariyad");
   mp.put(2,"sona");
   mp.put(3,"monu");

   
   
   for (int key : mp.keySet()) {
            System.out.println("key " + key + " value " + mp.get(key));
        }


    List<Integer>li = new ArrayList<>();
    li.add(10);
    li.add(20);
    li.add(50);

    for(int ele:li)
    System.out.println(ele);

    Collections.sort(li);








    }
}