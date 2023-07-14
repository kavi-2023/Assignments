package week3.day1;

public class Smasung extends AndroidTV{

	public void playVideo() {
		
		System.out.println("Watch Video");
		
	}
	
	public static void main(String[] args) {
		 
		Smasung s=new Smasung();
		s.playVideo();
		s.openApp();
		
	}

}
