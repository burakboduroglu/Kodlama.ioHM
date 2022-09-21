
public class Main {

	public static void main(String[] args) {
		Student student = new Student("123@gmail.com");
		student.setName("Burak");
		student.setLastName("Boduroğlu");
		student.set_Lecture("Java-React");
		
		
		Teacher teacher = new Teacher("Programlama Eğitmeni");
		teacher.setName("Engin");
		teacher.setLastName("Demiroğ");
		teacher.set_Lecture("Java-React");
		
		UserManager userManager = new UserManager();
		userManager.deleteAccount(teacher);
		userManager.registerAccount(student);

		TeacherManager teacherManager = new TeacherManager();
		teacherManager.detail(teacher);
		teacherManager.addLecture(teacher);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerLecture(student);
	}

}
