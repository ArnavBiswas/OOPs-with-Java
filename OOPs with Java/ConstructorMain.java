//1.Write a Java program which will demonstrate constructor overloading.

class C{
	String a;
	C(){
		a = "WORLD"; 
	}	
	
	C(String msg){
		a = msg;
	}
		
	void show () {
		System.err.println("HEELO !" +a);
	}
}

public class ConstructorMain{
	public static void main(String [] args){
		C o1 = new C();
		C o2 = new C("XYZ");
		o1.show();
		o2.show();
	}
}