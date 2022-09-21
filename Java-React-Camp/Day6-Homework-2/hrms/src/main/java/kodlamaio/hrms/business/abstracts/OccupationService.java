package kodlamaio.hrms.business.abstracts;
import java.util.List;
import kodlamaio.hrms.entities.concretes.Occupations;

public interface OccupationService {
	List<Occupations> getAll();
}
