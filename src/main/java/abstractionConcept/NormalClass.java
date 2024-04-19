package abstractionConcept;

public class NormalClass extends ABsClas {

	@Override
	public void fg() {
		System.out.println("supermarket");
	}

	public static void main(String[] args) {
		NormalClass i = new NormalClass();
		i.fg();
		i.partial();
	}

}
