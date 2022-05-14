package Java8_Features;




/*
 * 
 * @FunctionalInterface annotation is used to ensure that the 
 * functional interface can’t have more than one abstract method. 
 * In case more than one abstract methods are present, the compiler flags an
 *  ‘Unexpected @FunctionalInterface annotation’ message. 
 * However, it is not mandatory to use this annotation.
 */
public class deviationReni{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FInterface cf =(a,b)->{
			int c=0;	
			return c=(a+b);
		};
		System.out.println(cf.say(10, 20));
	}

}
