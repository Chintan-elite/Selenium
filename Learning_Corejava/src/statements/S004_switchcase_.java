package statements;

public class S004_switchcase_ {
	public static void main(String[] args) {
		
		
		String grade = "D";
		
		switch(grade) {
		
		case "A" :System.out.println("Very good");
		break;
		case "B" :System.out.println("good");
		break;
		case "C" :System.out.println("need improvement");
		break;
		default: System.out.println("Invalid choice");
		
		}
		
		
	}
}
