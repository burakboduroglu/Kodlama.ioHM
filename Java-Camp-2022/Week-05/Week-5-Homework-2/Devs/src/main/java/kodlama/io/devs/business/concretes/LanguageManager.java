package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;

import kodlama.io.devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.language.GetAllLanguagesResponse;
import kodlama.io.devs.business.responses.language.GetLanguagesByIdResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    public List<GetAllLanguagesResponse> getAll() {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();

        for (Language language : languages){
            GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());

            languagesResponse.add(responseItem);
        }
        //iş kuralları
        return languagesResponse;
    }

    public void add(CreateLanguageRequest createLanguageRequest){
        Language language = new Language();
        language.setName(createLanguageRequest.getName());
        if(!isExist(language)){
            this.languageRepository.save(language);
        } else {
            throw new RuntimeException("This language has already exist added.");
        }
    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        Language language = this.languageRepository.findById(updateLanguageRequest.getId()).get();
        if(!isExist(language)){
            language.setName(updateLanguageRequest.getName());
            this.languageRepository.save(language);
        } else {
            throw new RuntimeException("This language already exist.");
        }
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        this.languageRepository.deleteById(deleteLanguageRequest.getId());
    }

    @Override
    public GetLanguagesByIdResponse getId(int id) {
        Language language = this.languageRepository.findById(id).get();
        GetLanguagesByIdResponse byIdResponse =  new GetLanguagesByIdResponse();
        byIdResponse.setName(language.getName());
        byIdResponse.setId(language.getId());
        return byIdResponse;
    }

    public boolean isExist(Language language){
        boolean exist = false;
        List<Language> languages = languageRepository.findAll();
        for (Language lng : languages){
            if (lng.getName().toLowerCase().equals(language.getName().toLowerCase())) {
                exist = true;
                return exist;
            }
        }
        return exist;
    }
}
