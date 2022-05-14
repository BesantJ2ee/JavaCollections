package Java8_Features;

public class FeaturesApplication {

	public static void main(String[] args) {
		 int width=10; 
		// TODO Auto-generated method stub
		//Lambda expressions
		//Lambda expression helps us to write our code in functional style. 
		//It provides a clear and concise way to implement SAM interface(Single Abstract Method) by using an expression
        //Useful in collection library in which it helps to iterate, filter and extract data
		
		Drawable d= ()->{
			System.out.println("Drawing "+width);		
			};
			  d.draw();
	}

}
