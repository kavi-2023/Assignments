package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println(id);

	}

	public void getStudentInfo(int id,String name) {
		
		System.out.println(id+","+ name);

	}
	
	public void getStudentInfo(String email,int phno) {
		
		System.out.println(email+","+phno);

	}
	
	public static void main(String[] args) {
		
		Students s=new Students();
		s.getStudentInfo(10);
		s.getStudentInfo(3, "Kavi");
		s.getStudentInfo("k@123.com", 8654323);
	}
}
