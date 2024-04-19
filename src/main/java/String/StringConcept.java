package String;

public class StringConcept {

	public static void main(String[] args) {
		String s ="selvaraj";
		System.out.println(s);
		
		int y=s.length();
		System.out.println(y);
		
		char ch=s.charAt(3);
		System.out.println(ch);
		
		boolean  b=s.contains("selva");
		System.out.println(b);
		
		boolean dd=s.equalsIgnoreCase("Selvaraj");
		System.out.println("Equals "+dd);
		
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.substring(0, 8));
		
		System.out.println(s.endsWith("s"));
		
		System.out.println(s.startsWith("n"));
		
		String[] g=s.split("a");
		
		System.out.println(g[3]);
	
	}
}
