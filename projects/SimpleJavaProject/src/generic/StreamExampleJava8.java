package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleJava8 {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		
		for(int i=0; i<100; i++) myList.add(i);
		
		//Sequentials Stream
		
		Stream<Integer> seqStream = myList.stream();
		Stream<Integer> parStream = myList.parallelStream();

		Stream<Integer> highNums = seqStream.filter(p -> p>90);
		Stream<Integer> highNums1 = parStream.filter(p -> p>90);
		
		
		highNums.forEach(p ->System.out.println("Hi nums" +p));
		
		highNums1.forEach(i -> System.out.println("Hi nums using par"+i));
	}

}
