
public class Main {

	public static void main(String[] args) {
		Lectures lesson1 = new Lectures(1,"C# + Angular Kamp","Engin Demiroð");
		Lectures lesson2 = new Lectures(2,"Java + React","Engin Demiroð");
		Lectures lesson3 = new Lectures(3,"Programlamaya Giriþ","Engin Demiroð");
		RegisterManager registerCourse =  new RegisterManager();
		
		Lectures[] courses = {
			lesson1,
			lesson2,
			lesson3		
		};
		System.out.println("*****Kurslar*****");
		for (Lectures lesson : courses) {
			System.out.println(lesson.id + " " + lesson.name + " " + lesson.instructor );	
		}
		System.out.println("\n***KAYDINIZ ONAYLANDI***");
		registerCourse.register(lesson2);
	}
}