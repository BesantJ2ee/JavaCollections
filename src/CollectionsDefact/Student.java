package CollectionsDefact;

public class Student implements Comparable<Student>{
	
	int rollno;  
	String name;  
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	
	
	
	
	
}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		/*if(age==st.age)    
 return 0;    
 else if(age<st.age)    
 return 1;    
 else    
 return -1;    */
		
		
		
		return this.getName().compareTo(o.getName());
	}

}
