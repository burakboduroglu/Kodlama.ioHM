
public class StudentManager extends UserManager{
	public void registerLecture(Student student) {
		System.out.println(student.getName()+ " " +student.getLastName() + " adlı öğrenci " + 
	    student.get_Lecture() + " dersine kayıt oldu.");
	}
}
