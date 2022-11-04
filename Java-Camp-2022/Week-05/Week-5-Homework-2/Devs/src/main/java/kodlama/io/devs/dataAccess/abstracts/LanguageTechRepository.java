package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.LanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageTechRepository extends JpaRepository<LanguageTechnology, Integer> {

}
