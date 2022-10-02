package CollectionPractice;

import java.util.List;

public class ArrayList {

  public static void main(String[] args)
    {
        //ArrayList with no size defined
 
        ArrayList list = new ArrayList();
 
        //Adding elements to ArrayList
 
        list.add("pravin");
 
        list.add(20);
 
        list.add(30);
 
        list.add(40);
 
        System.out.println(list.size());     //Output : 4
 
        //Removing an element at index 0
 
        list.remove(0);
 
        System.out.println(list.size());    //Output : 3
    }
}