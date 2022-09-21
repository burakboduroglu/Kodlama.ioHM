
public class TeacherManager extends UserManager{
	public void detail(Teacher teacher) {
		System.out.println
		(teacher.getName() + " " + teacher.getLastName() + " -> " + teacher.getDetail());
	}
	
	public void addLecture(Teacher teacher) {
		System.out.println
		(teacher.getName() + " " + teacher.getLastName() + " adlý eðitmen " + teacher.get_Lecture()
		+ " dersini ekledi.");
	}

}
