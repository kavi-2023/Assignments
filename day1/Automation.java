package week3.day1;

public class Automation extends MultipleLangauge implements Language,TestTool {
	
	@Override
	public void Java() {
		
		System.out.println("Language: Java");
		
	}
	
	@Override
	public void Selenium() {
		
		System.out.println("Language: Selenium");
	}
	
	@Override
	public void ruby() {
		
		System.out.println("Language: Ruby");
	}
	
    public static void main(String[] args) {
    	
    	Automation a=new Automation();
    	a.Java();
    	a.Selenium();
    	a.python();
    	a.ruby();
				
			}	
	
	
	}
	
       
            
            	
            

