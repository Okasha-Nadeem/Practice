package yuyuu;

class calculator{
	public void addition(int a,int b) {
	
	System.out.println("Integer Addition: "+ (a+b));
	
		
	
	}
	
	public void addition(double a,double b) {
		
		System.out.println("Double Addition: "+ (a+b));
		
	}
	
	public void multi(int a,int b) {
		System.out.println("Integer Multi"+(a*b));
	}
	
	public void multi(double a,double b) {
		System.out.println("Double Multi"+(a*b));
	}
	
	public void sub(int a,int b) {
		System.out.println("Integer Subtraction"+(a-b));
	}
	
	public void sub(double a,double b) {
		System.out.println("Double Subtraction"+(a-b));
	}
		
	
	public void division(int a,int b) {
		System.out.println("Integer Division"+(a/b));
	}
	
	public void division(double a,double b) {
		System.out.println("Double Divison"+(a/b));
	}
		

}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c = new calculator();
		c.addition(2.3,3.56);
		c.addition(2,6);
		c.sub(2, 5);
		c.sub(26.0, 6.3);
		c.division(2.3, 25.3);
		c.division(6, 25);
		c.multi(22.1, 53.2);
		c.multi(2, 5);
	}

}
