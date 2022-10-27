package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    Language getId(int id);
    void add(Language language);
    void delete(int id);
    void update(Language language);
}
