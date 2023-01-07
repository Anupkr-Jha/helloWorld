package p2;

public abstract class C {
	int id = 10;
	static String name = "Anup";

	C(String str) {
         System.out.println("paramatrized constructor"+str);
	}
	
	{
	System.out.println("IIIB");	
	}
   static {
	   System.out.println("SSIIB");
   }
	protected abstract void exam();

	abstract public void exam1();

	protected void exam2() {
		System.out.println("abstract class exam2");
	}
}
