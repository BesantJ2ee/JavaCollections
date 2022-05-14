package Java8_Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction t1= new Transaction(7,"GROCERY",190);
		Transaction t2= new Transaction(8,"MOBIL",180);
		Transaction t3= new Transaction(3,"GROCERY",170);
		Transaction t4= new Transaction(1,"MOBIL",160);
		Transaction t5= new Transaction(9,"GROCERY",150);
		Transaction t6= new Transaction(0,"MOBILE",10);
		
		
		List<Transaction> te= Arrays.asList(t1,t2,t3,t4,t5,t6);

		List<Integer> transactionId = te.stream().
				filter(k->k.getTransactionType().equalsIgnoreCase("GROCERY"))
				.sorted((o1,o2)->o1.getId().compareTo(o2.getId()))
				.map(c->c.getId())
				.collect(Collectors.toList());
		System.out.println(transactionId);
		
		Boolean transactionIds = te.stream().
				anyMatch(k->k.getTransactionType().equalsIgnoreCase("GROCERY"));
		
		long transactionIdu = te.stream().
				filter(k->k.getTransactionType().equalsIgnoreCase("GROCERY"))
				.count();
		
		Boolean allMach = te.stream().
				allMatch(k->k.getTransactionType().equalsIgnoreCase("GROCERY"));
		
		Boolean noMach = te.stream().
				noneMatch(k->k.getTransactionType().equalsIgnoreCase("MILF"));
		
		List<Integer> transactionIdvdd = te.stream().distinct()
				.sorted((o1,o2)->o1.getId().compareTo(o2.getId()))
				 .map(c->c.getId())
				.collect(Collectors.toList());
		
		Stream<Integer> stream
        = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

    // apply dropWhile to drop all the numbers
    // matches passed predicate
    List<Integer> list
        = stream.dropWhile(number -> (number == 4))
              .collect(Collectors.toList());

    // print list
    System.out.println(list);
				
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<?>>>>>>>>>>>>>>>>>>>>");
		transactionIdvdd.forEach(System.out::println);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<?>>>>>>>>>>>>>>>>>>>>");
		System.out.println(transactionId);
		System.out.print(transactionIds);
		System.out.print(transactionIdu);
		System.out.println(allMach);
		System.out.println(noMach);
		
			
	}

}
