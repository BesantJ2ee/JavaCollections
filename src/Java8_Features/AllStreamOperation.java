package Java8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
public class AllStreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		
		  int a[]= {3,4,4,7,3}; //Declare an Array
           
            Arrays.stream(a).filter(x->x%2==0).forEach(System.out::println); //Find the numbers divisible by 2
         
           System.out.println("Sum1 "+IntStream.of(a).map(i -> i).sum());
           System.out.println("Sum2 "+Arrays.stream(a).filter(x->x%2==0).sum());
          
           //To find 
           OptionalDouble average=Arrays.stream(a).average();
                   
           if(average.isPresent())
          {
          	  System.out.println("Average"+average.getAsDouble());	
          }
          if(average.getAsDouble() == 0.0)
          {
          	System.out.println("Average is 0");
          }
         
          OptionalInt maxValue=Arrays.stream(a).max();
          OptionalInt minValue=Arrays.stream(a).min();
           
          System.out.println("Max    "+maxValue.getAsInt());
          
          System.out.println("Max    "+minValue.getAsInt());
          
          
          IntStream stream = IntStream.range(3, 400);
          Stream<Integer> stream1 = stream.boxed();
         
               
          Stream<Object> stream5 = Stream.concat(stream1,
                  Stream.of("Geeks", "for", "Geeks"));
          
          stream5.forEach(System.out::println);
          stream5.close();
          stream1.close();
          
          DoubleStream doubleStream = DoubleStream.generate(()
                  -> { 
                	  return (double)(Math.random() * 10000); 
                	  });
         
               // Displaying the randomly generated values
          doubleStream.limit(7).forEach(System.out::println);
          doubleStream.close();
          
          Stream<Integer> boxed=Arrays.stream(a).boxed();
          
          boxed.forEach(  
                  (n)->System.out.println(n)  
              );    
          //boxed.forEach( System.out::println); 
          boxed.close();
          
          //FlatMap
          List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
          
          // Creating a list of Odd Numbers
          List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
            
          // Creating a list of Even Numbers
          List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
    
          List<List<Integer>> listOfListofInts =
                  Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
    
          System.out.println("The Structure before flattening is : " +
                                                    listOfListofInts);
            
          // Using flatMap for transformating and flattening.
          List<Integer> listofInts  = listOfListofInts.stream()
                                      .flatMap(n -> n.stream())
                                      .collect(Collectors.toList());
    
          System.out.println("The Structure after flattening is : " +
                                                           listofInts);
          
          
          ArrayList<Integer> marks = new ArrayList<Integer>();
          
          // These are marks of the students
          // Considering 5 students so input entries
          marks.add(30);
          marks.add(78);
          marks.add(26);
          marks.add(96);
          marks.add(79);
   
          // Printing the marks of the students before grace
          System.out.println(
              "Marks of students before grace : " + marks);
   
          // Now we want to grace marks by 6
          // using the streams to process over processing
          // collection
   
          // Using stream, we map every object and later
          // collect to List
          // and store them
          List<Integer> updatedMarks
              = marks.stream()
                    .map(i -> i + 6)
                    .collect(Collectors.toList());
   
          // Printing the marks of the students after grace
          System.out.println(
              "Marks of students  after grace : "
              + updatedMarks);
      }
                  
	

}
