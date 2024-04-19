package packageName;

import secondPackage.ProtectedExample;

public class ClassOne extends ProtectedExample{

	public void  methodName() {
		System.out.println("sysout is used to print in console");
	}

public static void main(String[] args) {
	ClassOne objName = new ClassOne();
	objName.methodName();
	objName.example();
}

}
