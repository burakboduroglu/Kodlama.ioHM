package kodlamaio.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.Occupations;

public interface OccupationDao extends JpaRepository<Occupations, Integer>{

}
