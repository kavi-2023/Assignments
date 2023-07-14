package week3.day1;

public class Claculator {
	
	public void add(int a,int b) {
		
		System.out.println(a+b);

	}

	public void add(int a,int b,int c) {
		
		System.out.println(a+b+c); 

	}
	
	public void multiple(double a,double b) {
		
       System.out.println(a+b);
	}
	
	public void multiple(float a,float b) {
		
		System.out.println(a+b);

	}
	
	public static void main(String[] args) {
		
		Claculator cal=new Claculator();
		cal.add(10, 20);
		cal.add(5, 10, 3);
		cal.multiple(123, 3457);
		cal.multiple(5.3f,2.3f);
	}
}
