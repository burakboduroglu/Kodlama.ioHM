package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen JDBC ile eklendi : " + instructor.getName());
    }
}
