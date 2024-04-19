package Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListConcept {
	public static void main(String[] args) {
		List dff= new LinkedList();
		dff.add(22);
		dff.add(333);
		dff.add(22);
		dff.add(1224);
		System.out.println(dff);
		
		Set fgf= new LinkedHashSet();
		fgf.addAll(dff);
		System.out.println(fgf);
		
	Set<Integer> fg= new LinkedHashSet<Integer>();
	Set<Integer> fga= new LinkedHashSet<Integer>();
	fg.add(100);
	fg.add(100);
	fg.add(2234);
	fg.add(343);
	fg.add(1);
	fga.addAll(fg);
	fga.add(565);
	fg.remove(2234);
	
	fga.removeAll(fg);
	
	System.out.println(fg);
	System.out.println(fga);
  	
	for(Integer destination:fg) {
		System.out.println(destination);
	}
	
	}
}
