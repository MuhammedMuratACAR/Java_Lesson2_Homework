
public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�",90);
		
		Course course2=new Course();
		course2.id=2;
		course2.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)";
		course2.instructor="Engin Demiro�";
		course2.progress=25;
		
		Course course3=new Course();
		course3.id=3;
		course3.name="Programlamaya Giri� i�in Temel Kurs";
		course3.instructor="Engin Demiro�";
		course3.progress=100;

		Course[] courses= {course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		
		Student student1=new Student(1,"Muhammed Murat ACAR",24,"Ankara","muhammedmuratacarr@gmail.com");
		
		Student student2=new Student();
		student2.id=2;
		student2.name="Osman �o�kun";
		student2.age=20;
		student2.city="�stanbul";
		student2.mail="osmansckn@gmail.com";
		
		Student student3=new Student();
		student3.id=2;
		student3.name="Berat �etin";
		student3.age=22;
		student3.city="Bursa";
		student3.mail="beratcetin@gmail.com";

		Student[] students= {student1,student2,student3};
		for (Student student : students) {
			System.out.println(
					"��rencinin Ad�: " + student.name +
					" Ya��: " + student.age + 
					" Ya�ad��� �ehir: " + student.city+
					" Mail: " + student.mail
					);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.courseList(course1);
		courseManager.addToCourse(course2);

		
		StudentManager studentManager=new StudentManager();
		studentManager.studentList(student1);
		studentManager.addToStudent(student2);
		studentManager.deleteToStudent(student3);
		

	}

}
