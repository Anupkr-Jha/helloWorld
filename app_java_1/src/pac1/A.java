package pac1;

public class A extends D implements C,B{
	A(){
	super(450,258.4f);	
	}
	static {
		A a1 = new A();
		int v = 30;
		System.out.println(a1 + " " + v);
	}
		@Override
		public  boolean test(byte g, String str) {
			System.out.println(g+" "+str);
			return true;
		}
		@Override
		public boolean test5(float k,long lg) {
			System.out.println(k+" "+lg);
			return false;
		}
		@Override
		public void test13(double d, byte b) {
			System.out.println(d+" "+b);
		}
		public static void main(String[] args) {
			  
			A a1=new A();
			a1.test((byte)5, "psa");
			a1.test5(28.2f, 258);
			a1.test13(25.8, (byte)2);
			
			System.out.println(B.b);
			System.out.println(B.s);
			System.out.println(B.l);
			System.out.println(B.f);
			float ft=a1.test3("Demo", 89.5, 's');
			System.out.println(ft);
			long lt=a1.test2(54.5);
			System.out.println(lt);
			C c1=(float k,long lg)->{
				System.out.println(k+""+lg);
				return true;
			};
			boolean bb=c1.test5(54.5f,564);
			System.out.println(bb);
		char c=	C.test8("dev");
		System.out.println(c);
			int p=a1.test6(8, 10);
			System.out.println(p);
			System.out.println(C.i+" "+C.j);
			a1.test13(89.5, (byte)5);
			a1.test14(589.5f);
			System.out.println(C.c1);
			System.out.println(a1.d1);
		}
		
	}
	


