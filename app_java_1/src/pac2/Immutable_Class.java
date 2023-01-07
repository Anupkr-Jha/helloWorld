package pac2;

final public class Immutable_Class {
	private final String name;
	private final int age;

	public Immutable_Class(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		//System.out.println(name);
		return name;
	}

	public int getAge() {
		//System.out.println(age);
		return age;
	}

	public static void main(String[] args) {
		Immutable_Class ic = new Immutable_Class("anup", 25);
		ic.getAge();
		ic.getName();
	}
}
