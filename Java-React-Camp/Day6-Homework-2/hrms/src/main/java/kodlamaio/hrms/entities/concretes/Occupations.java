package kodlamaio.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.GeneratedValue;

@Data
@Entity
@Table(name = "occupations")

public class Occupations {
	
	@Id
	@GeneratedValue
    @Column(name = "occupationId")
    private int Id;
    
    @Column(name = "occupationName")
	private String name;
	
	
	public Occupations(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
}


