package Java8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sayable s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.say("Sonoo"));  
	        
	        
	        Sayable s2= name ->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s2.say("Sonoo"));  
	        
	        
	        
	        
	        Addable ad1=(a,b)->(a+b);  
	        System.out.println(ad1.add(10,20));  
	          
	        // Multiple parameters with data type in lambda expression  
	        Addable ad2=(int a,int b)->(a+b);  
	        System.out.println(ad2.add(100,200));  
	        
	        Addable ad3=(int a,int b)->{  
                return (a+b);   
                };  
             System.out.println(ad3.add(100,200));
             
             
             int a[]= {3,4,4,7,3};
             
             Arrays.stream(a).filter(x->x%2==0).forEach(System.out::println);
             
             int sum1=IntStream.of(a).map(i -> i).sum();
             System.out.println("Sum1"+sum1);
             int sum = Arrays.stream(a).filter(x->x%2==0).sum();
             //A container object which may or may not contain a double value. 
             //If a value is present, isPresent() will return true and getAsDouble() will return the value.
             OptionalDouble average=Arrays.stream(a).average();
             
             
             
             if(average.isPresent())
            {
            	  System.out.println("Average"+average.getAsDouble());	
            }
            if(average.isEmpty()||average.getAsDouble() == 0.0)
            {
            	System.out.println("Average is 0");
            }
           
             
            OptionalInt k=Arrays.stream(a).max();
            OptionalInt p=Arrays.stream(a).min();
            
            
            IntStream stream = IntStream.range(3, 400);
            Stream<Integer> stream1 = stream.boxed();
          
            Stream<Object> stream5 = Stream.concat(stream1,
                    Stream.of("Geeks", "for", "Geeks"));
            
            stream5.forEach(System.out::println);
            
            
            Stream<Integer> k1=Arrays.stream(a).boxed();
            
            k1.forEach(  
                    (n)->System.out.println(n)  
                );  
            
            System.out.println("Max    "+k.getAsInt());
            
            System.out.println("Max    "+p.getAsInt());
            
            
            List number = Arrays.asList(2,3,4,5);
            int even = (int) number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
            
             List<String> list=new ArrayList<String>();  
             list.add("ankit");  
             list.add("mayank");  
             list.add("irfan");  
             list.add("jai");  
               
             list.forEach(  
                 (n)->System.out.println(n)  
             );  
	}

}
