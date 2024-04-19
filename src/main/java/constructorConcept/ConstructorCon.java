package constructorConcept;

public class ConstructorCon {

	public ConstructorCon() {
	this(10,"sundar");
		System.out.println(100-1);
	}
	
	public ConstructorCon(int y,String a) {
		this(false,"mohan");
		System.out.println(100-2);
	}
	
   public ConstructorCon(boolean y,String a) {
		
		System.out.println(100-3);
	}
	
	public static void main(String[] args) {
		ConstructorCon nmn = new ConstructorCon();
	
		
		
	}
}
