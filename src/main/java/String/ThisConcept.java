package String;

public class ThisConcept extends SuperConcept {

	int i=90;
	
	public void selva() {

	int i=88;
	System.out.println(super.i);

	}
	
	public static void main(String[] args) {
		ThisConcept jk = new ThisConcept();
		jk.selva();
	}
}
