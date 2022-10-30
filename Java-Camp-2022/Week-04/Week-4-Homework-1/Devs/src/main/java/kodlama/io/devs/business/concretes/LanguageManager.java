package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getId(int id) {
        return languageRepository.getId(id);
    }

    public void add(Language language){
        if(!isExist(language)){
            if(!language.getName().equals("")){
                languageRepository.add(language);
            } else {
                throw new RuntimeException("Name must not be null");
            }
        }
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public void update(Language language) {
        if(!language.getName().equals("")){
            languageRepository.update(language);
        } else {
            throw new RuntimeException("Name must not be null");
        }
    }

    public boolean isExist(Language language){
        boolean control = false;
        for (Language lng : languageRepository.getAll()){
            if(lng.getName().equals(language.getName()) || lng.getId() == language.getId()){
                control = true;
            }
        }
        return control;
    }

}
