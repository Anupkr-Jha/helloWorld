package pac1;

public abstract class D {

	D d1 = null;

	D(int j, float t) {
		this('x',25.5);
    System.out.println(j+" "+t);
	}
	D(char g,double d){
		System.out.println(g+" "+d );
		
	}
	int l;
	{
		l=6;
		System.out.println("iib"+l);
	}
	static {
		String st="anup";
		System.out.println("sib"+st);
	}
	public abstract void test13(double d,byte b);
	
	public void test14(float f) {
		System.out.println(f);
	}
	
}
