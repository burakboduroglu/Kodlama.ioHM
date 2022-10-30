package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"Python"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Java"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getId(int id) {
        for (Language language : languages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }



    public void add(Language language){
        languages.add(language);
    }

    public void delete(int id){
        for (Language lng : languages) {
            if(lng.getId() == id){
                languages.remove(lng);
            }
        }
    }

    public void update(Language language){
        for (Language lng : languages) {
            if (language.getId() == lng.getId()){
                lng.setId(language.getId());
                lng.setName(language.getName());
            }
        }
    }
}
