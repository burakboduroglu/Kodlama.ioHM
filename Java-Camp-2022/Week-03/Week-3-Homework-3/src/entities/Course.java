package entities;

public class Course extends BaseEntity{
    private String courseName;
    private Category category;
    private double price;

    public Course(int id, String courseName, Category category, double price) {
        super(id);
        this.courseName = courseName;
        this.category = category;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
