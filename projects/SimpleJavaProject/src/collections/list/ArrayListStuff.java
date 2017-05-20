package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListStuff {
	
	public static void main (String[] args){		
		
		//arrayList();
		List<String> arrayList = new CopyOnWriteArrayList<String>();
		
		String[] array = {"a" , "b", "c" ,"d"};
		
		arrayList = new CopyOnWriteArrayList<String> (Arrays.asList(array));
		Iterator<String> iterator = arrayList.iterator();
		
		
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());	
			arrayList.add("6");
		}
		
	}

	private static void arrayList() {
		List<String> arrayList = new ArrayList<>();
		
		String[] array = {"a" , "b", "c" ,"d"};
		
		arrayList = Arrays.asList(array);
		Iterator<String> iterator = arrayList.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			arrayList.add("6");
		}
	}

}
