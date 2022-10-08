import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.BaseLogger;
import core.DatabaseLogger;
import core.EmailLogger;
import core.FileLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) {
        //Logger
        BaseLogger[] loggers = {new DatabaseLogger(), new EmailLogger()};

        //Category Manager
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        //Category-1
        Category category1 = new Category(1,"Programlama");
        categoryManager.add(category1);
        //Category-2
        Category category2 = new Category(2,"Programlama");
        categoryManager.add(category2);

        System.out.println("*****************************************");

        //Instructor Manager
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        //Instructor-1
        Instructor instructor1 = new Instructor(1,"Ad","Soyad","Yazılım Eğitmeni");
        instructorManager.add(instructor1);
        //Instructor-2
        Instructor instructor2 = new Instructor(2,"Ad","Soyad","Yazılım Eğitmeni");
        instructorManager.add(instructor2);

        System.out.println("*****************************************");

        //Course Manager
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        //Course-1
        Course course1 = new Course(1,"Java Kursu",category1,40);
        courseManager.add(course1);
        //Course-2
        Course course2 = new Course(2,"C# Kursu",category1,-10);
        courseManager.add(course2);

    }
}