package CollectionsDefact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
	//Here we have compare method compare(object, object2) Compare fist object with second object
	//Provides multiple sorting techniques sort any data member
	//equals(object o) compare current object with specfied object
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		  ArrayList<College> a2=new ArrayList<College>();    
		  a2.add(new College(101,"Vijay",23));    
		  a2.add(new College(106,"Ajay",27));    
		  a2.add(new College(105,"Jai",21)); 
		  a2.add(new College(107,"Jai",20));
		//Sorting elements on the basis of name 
		   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>"); 
		  Comparator<College> cm1=Comparator.comparing(College::getName);  
		   Collections.sort(a2,cm1);  
		   System.out.println("Sorting by Name");  
		   for(College st: a2){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
		   //Sorting elements on the basis of age  
		   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");  
		    Comparator<College> cm2=Comparator.comparing(College::getAge);  
		Collections.sort(a2,cm2);  
		   System.out.println("Sorting by Age");  
		   for(College st: a2){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }    
		   System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");  	   
		   Comparator<College> cm3=Comparator.comparingInt(College::getAge);
		   Collections.sort(a2,cm3); 
		   for(College st: a2){  
			     System.out.println(st.rollno+" "+st.name+" "+st.age);  
			     }
		   System.out.println("<<<<<<<<<<<<<<Norder>>>>>>>>>>>>>>>>>>>>>>>");  
		   List<Integer> values
           = Arrays.asList(212, 324,
                           435, 566,
                           133, 100, 121);
 
       // naturalOrder is a static method
            values.sort(Comparator.naturalOrder());
            System.out.println(values);
            System.out.println("<<<<<<<<<<<<<<Rorder>>>>>>>>>>>>>>>>>>>>>>>");  
 		   
            
            List<Integer> values1
            = Arrays.asList(212, 324,
                            435, 566,
                            133, 100, 121);
  
        // naturalOrder is a static method
            
            if(null!=values1)
            {
            	values1.sort(Comparator.reverseOrder());
            }
            
            
             System.out.println(values1);
             
             System.out.println("<<<<<<<<<<<<<<ThenComparing>>>>>>>>>>>>>>>>>>>>>>>");  
   		   
             Comparator<College> compareByName = Comparator
             .comparing(College::getName)
             .thenComparing(College::getAge);
             Collections.sort(a2,compareByName); 
             for(College st: a2){  
			     System.out.println(st.rollno+" "+st.name+" "+st.age);  
			     }
             
            
             Comparator<College> cm5=Comparator.comparing(College::getName,Comparator.nullsFirst(String::compareTo));  
             Collections.sort(a2,cm5);  
             System.out.println("Considers null to be less than non-null");  
             for(College st: a2){  
                System.out.println(st.rollno+" "+st.name+" "+st.age);  
                }  
             Comparator<College> cm6=Comparator.comparing(College::getName,Comparator.nullsLast(String::compareTo));  
             Collections.sort(a2,cm6);  
             System.out.println("Considers null to be greater than non-null");  
             for(College st: a2){  
                System.out.println(st.rollno+" "+st.name+" "+st.age);  
                }  
	}

}
