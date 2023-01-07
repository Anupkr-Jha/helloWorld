package pac1;

public interface B {

	byte b = 10;
	short s = b;
	long l = 2000000l;
	float f = (float) l;

	public abstract boolean test(byte g, String str);

	default public long test2(double n) {
		System.out.println(n);
		return 5896;
	}

	default float test3(String str, double db, char ch) {
		System.out.println(str + "" + db + "" + ch);

		return 259.0f;
	}

}
