package kodlamaio.hrms.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.OccupationService;
import kodlamaio.hrms.dataAccess.abstracts.OccupationDao;
import kodlamaio.hrms.entities.concretes.Occupations;

@Service
public class OccupationManager implements OccupationService {

	private OccupationDao occupationDao;
	
	@Autowired
	public OccupationManager(OccupationDao occupationDao) {
		super();
		this.occupationDao = occupationDao;
	}

	@Override
	public List<Occupations> getAll() {
		
		return this.occupationDao.findAll();
	}

}
