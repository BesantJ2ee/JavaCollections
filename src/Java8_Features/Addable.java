package Java8_Features;

public interface Addable {
	int add(int a,int b); 
	
	default void say()
	{
		System.out.println("Calcuttta");
	}
	
	default void say2()
	{
		System.out.println("Calcuttta");
	}
	
}
