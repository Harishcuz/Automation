package controlStatement;

public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		
		catch(Exception s) {
			System.out.println(10/2);
		}
	}
}
