package business;

import core.BaseLogger;
import dataAccess.InstructorDao;
import entities.Category;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private BaseLogger[] loggers;
    private List<String> instructorName = new ArrayList<>();

    public InstructorManager(InstructorDao instructorDao, BaseLogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        if(instructorName.size() == 0){
            instructorName.add(instructor.getName());
            instructorDao.add(instructor);
            for (BaseLogger logger:loggers) {
                logger.log(instructor.getName());
            }
        } else {
            for (String name : instructorName) {
                if(name.equals(instructor.getName())){
                    System.out.println("Bu eğitmen daha önce eklenmiş : " + instructor.getName());
                    break;
                } else {
                    instructorDao.add(instructor);
                    for (BaseLogger logger:loggers) {
                        logger.log(instructor.getName());
                    }
                }
            }
        }
    }//add
}
