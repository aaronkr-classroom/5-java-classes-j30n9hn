public class Animal {
	private int numLegs = 4;
	private int age;
	private String name;

	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public void myRole(int age) {
		System.out.println("나는 고양이 집사입니다. 나이는" + age + "입니다.");
	}

	public void myRole(String name) {
		System.out.println(name + "은 고양이 학생입니다.");
	}
	
	public void myRole(int age, String name) {
		System.out.println(name + "은 고양이 자녀 입니다. 나이는 " + age + "입니다.");
	}

	public void sound() {
		System.out.println("동물의 울음소리~~~~");
	}
}
