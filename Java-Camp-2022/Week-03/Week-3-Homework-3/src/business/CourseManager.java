package business;

import core.BaseLogger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] loggers;

    public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course){
        if (course.getPrice() < 0){
            System.out.println("Kursun fiyatı 0 dan küçük olamaz : " + course.getCourseName());
        } else{
            courseDao.add(course);
            for (BaseLogger logger : loggers) {
                logger.log(course.getCourseName());
            }
        }
    }
}
