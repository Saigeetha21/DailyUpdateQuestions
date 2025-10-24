package mar11.ListInterface.com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add(1,"Sachin");    
        ListIterator<String> itr=al.listIterator();    
        System.out.println("Traversing elements in forward direction");   
        //hasnext gives the next values(like increasing=1,2,3)one by one and has previous (decreasing = 3,2,1)gives previous values
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
	}

}
