package p1;

public class Practice {

	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Practice p1 = new Practice();
		p1.setId(10);
		p1.setName("Anup");
		System.out.println(p1.getId());
		System.out.println(p1.getName());
	}
}
