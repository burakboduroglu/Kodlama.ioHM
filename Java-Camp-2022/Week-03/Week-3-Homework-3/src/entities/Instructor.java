package entities;

public class Instructor extends BaseEntity {
    private String name;
    private String lastName;
    private String about;

    public Instructor(int id, String name, String lastName, String about) {
        super(id);
        this.name = name;
        this.lastName = lastName;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
