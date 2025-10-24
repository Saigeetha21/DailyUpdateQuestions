package mar15.HashMap.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.util.TreeMap;

public class SortHashMapByKey {
	
	public static void main(String args[]) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
    hm.put(1,"geethu");
    hm.put(2,"teju");
    hm.put(4,"sanju");
    hm.put(3,"sahu");
    hm.forEach((key,value)->{
        System.out.println("key:"+key+",value:"+value);
    });  
    
    List<Integer> keys = new ArrayList<>(hm.keySet());

    Collections.sort(keys);
    for(Integer k :keys){
        System.out.println(hm.get(k));
    }
  //if we are using tree map it directly give the elements in sorting order.
  }
}
