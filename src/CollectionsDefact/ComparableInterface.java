package CollectionsDefact;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterface {
	//String objects
	//Wrapper class objects
	//User-defined class objects
	/*void sort(List list): It is used to sort the elements of 
	List. List elements must be of the Comparable type*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

	}

}
