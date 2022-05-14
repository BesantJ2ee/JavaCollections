package Java8_Features;
class Demo implements AutoCloseable {
    void show() { System.out.println("inside show"); }
    public void close()
    {
        System.out.println("close from demo");
    }
}
  
// custom resource 2
class Demo1 implements AutoCloseable {
    void show1() { System.out.println("inside show1"); }
    public void close()
    {
        System.out.println("close from demo1");
    }
}
public class ARMManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Demo d = new Demo(); Demo1 d1 = new Demo1()) {
            int x = 10 / 0;
            d.show();
            d1.show1();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
	}

}
