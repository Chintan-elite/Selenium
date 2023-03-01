package oops;

public class O007_Encaptulation {
	public static void main(String[] args) {
		
		Std s = new Std();
		//s.setdata(10, "Test","test@gmail.com");
		//s.display();
		s.setId(10);
		s.setName("tech");
		System.out.println(s.getId()+" "+s.getName());
		
		Std s1 = new Std();
		//s1.setdata(20, "tech","tech@gmail.com");
		//s1.display();
		
		
	}
}
