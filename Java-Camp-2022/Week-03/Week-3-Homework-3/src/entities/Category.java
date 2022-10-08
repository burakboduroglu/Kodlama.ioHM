package entities;

public class Category extends BaseEntity {
    private String categoryName;

    public Category(int id, String categoryName) {
        super(id);
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
