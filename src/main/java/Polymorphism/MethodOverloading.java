package Polymorphism;

public class MethodOverloading {

	public void sel(int a) {
		System.out.println(19);
	}
	
	public void sel(int a, String b) {
		System.out.println("int and  String");
	}

	public void sel(String a, boolean b) {
		System.out.println("String and boolean");
	}

	
	public static void main(String[] args) {
		MethodOverloading jk = new MethodOverloading();
		jk.sel("sef", true);
	}
	

	
}
