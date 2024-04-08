public class Ex704 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.id = 22222222;
		s1.name = "유재석";
		s1.printInfo();

		s2.insertRecord(33333333, "마동석");
		s2.printInfo();

		Student s3 = new Student(44444444, "가가가");
		s3.printInfo();
	}
}
