package generic;

import java.util.HashMap;
import java.util.Map;

public class HashMapStuff {

	Map map = new HashMap();
	
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    
    public static void main (String args[]){
    	String s ="kkkk";
    	System.out.println(s.hashCode());
    	System.out.println(hash(s));
    }
}
