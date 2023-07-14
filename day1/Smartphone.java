package week3.day1;

public class Smartphone extends AndroidPhone {
	
	public void takeVideo() {
		
		System.out.println("takeVideo-->Smartphone");

	}
			
	public static void main(String[] args) {
		
		Smartphone s=new Smartphone();
		s.takeVideo();
	}
}
