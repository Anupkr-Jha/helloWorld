package p2;

public class D extends C{
	D() {
		super("Anup");
		System.out.println("default");
		// TODO Auto-generated constructor stub
	}
	public void test2(int i) {
		System.out.println(i);
	}
	{
		System.out.println("IIB");
	}
	static {
		System.out.println("SIB");
	}
	public void test2(String s) {
		System.out.println(s);
	}
	public void test2(String name,int id) {
		System.out.println(name+" "+id);
	}
	@Override
	protected void exam() {
		// TODO Auto-generated method stub
		System.out.println("exam");
	}
	@Override
	public void exam1() {
		// TODO Auto-generated method stub
		System.out.println("exam1");
	}
	public static void main(String[] args) {
		D d1=new D();
		d1.exam();
		d1.exam1();
		d1.exam2();
		d1.test2(20);
		d1.test2("Anup");
		d1.test2("Anup", 25);
	}

}
