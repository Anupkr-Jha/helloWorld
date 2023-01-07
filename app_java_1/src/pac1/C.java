package pac1;
@FunctionalInterface
public interface C {
	int i=10,j=5;
 C c1=null;
 boolean test5(float k,long lg);
 default int test6(int i,int j) {
	 int z=(i+j)/2;
	 return z;
 }
	 public static char test8(String s1) {
		 System.out.println(s1);
		 return 'a';
	 }
 }

