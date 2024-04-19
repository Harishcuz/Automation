package prasannaClass;

public class BasicClassFile {

	
	public  int hari() {
		
     int a=1990;
     int b=13;
     int c=a+b;
	return c ;
	}
	
	public  void haris() {
		System.out.println("hari");
	   
		}
	
	public static void harish() {
		System.out.println("birthday year is");
	   
		}
	
	public static void main(String[] args) {
		
		 BasicClassFile hlo = new BasicClassFile();

    int u= hlo.hari();
    hlo.haris();
    harish();
	
		System.out.println(u);
	}
}
