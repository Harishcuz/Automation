package Collections;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int[] h = new int[5];
		h[0]=160;
		h[1]=103;
		h[2]=105;
		h[3]=1066;
		h[4]=170;
		
		int size=h.length;
		
	//	System.out.println(h[1]);
		for(int i=0;i<size;i++) {
			System.out.println(h[i]);
		}
	}
}
