package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageTechService;
import kodlama.io.devs.business.requests.languageTech.CreateLanguageTechRequest;
import kodlama.io.devs.business.requests.languageTech.DeleteLanguageTechRequest;
import kodlama.io.devs.business.requests.languageTech.UpdateLanguageTechRequest;
import kodlama.io.devs.dataAccess.languageTech.GetAllLanguageTechsResponse;
import kodlama.io.devs.dataAccess.languageTech.GetLanguageTechByIdResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.LanguageTechRepository;
import kodlama.io.devs.entities.concretes.Language;
import kodlama.io.devs.entities.concretes.LanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageTechManager implements LanguageTechService {
    private LanguageTechRepository languageTechRepository;
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageTechManager(LanguageTechRepository languageTechRepository, LanguageRepository languageRepository) {
        this.languageTechRepository = languageTechRepository;
        this.languageRepository = languageRepository;
    }

    @Override
    public void add(CreateLanguageTechRequest createLanguageTechRequest) {
        LanguageTechnology languageTechnology = new LanguageTechnology();
        languageTechnology.setName(createLanguageTechRequest.getName());
        Language language = languageRepository.findById(createLanguageTechRequest.getLanguageId()).get();
        languageTechnology.setLanguage(language);
        if(!isExist(languageTechnology)){
            languageTechRepository.save(languageTechnology);
        } else {
            throw new RuntimeException("This technology has already added.");
        }

    }

    @Override
    public List<GetAllLanguageTechsResponse> getAll() {
        List<LanguageTechnology> techLanguages = languageTechRepository.findAll();
        List<GetAllLanguageTechsResponse> techLanguagesResponse = new ArrayList<>();

        for (LanguageTechnology techLanguage : techLanguages){
            GetAllLanguageTechsResponse responseItem = new GetAllLanguageTechsResponse();
            responseItem.setId(techLanguage.getId());
            responseItem.setName(techLanguage.getName());
            responseItem.setLanguage(techLanguage.getLanguage().getName());

            techLanguagesResponse.add(responseItem);
        }
        return techLanguagesResponse;
    }

    @Override
    public void delete(DeleteLanguageTechRequest deleteLanguageTechRequest) {
        this.languageTechRepository.deleteById(deleteLanguageTechRequest.getId());
    }

    @Override
    public GetLanguageTechByIdResponse getId(int id) {
        LanguageTechnology languageTechnology = this.languageTechRepository.findById(id).get();
        GetLanguageTechByIdResponse getLanguageTechByIdResponse = new GetLanguageTechByIdResponse();
        if(!isExist(languageTechnology)){
            getLanguageTechByIdResponse.setLanguage(languageTechnology.getLanguage().getName());
            getLanguageTechByIdResponse.setName(languageTechnology.getName());
            getLanguageTechByIdResponse.setId(id);
        } else {
            throw new RuntimeException("This technology already exist.");
        }

        return getLanguageTechByIdResponse;
    }

    @Override
    public void update(UpdateLanguageTechRequest updateLanguageTechRequest) {
        LanguageTechnology languageTechnology = languageTechRepository.findById(updateLanguageTechRequest.getId()).get();
        languageTechnology.setName(updateLanguageTechRequest.getName());
        Language language = languageRepository.findById(updateLanguageTechRequest.getLanguageId()).get();
        languageTechnology.setLanguage(language);
        this.languageTechRepository.save(languageTechnology);
    }

    public boolean isExist(LanguageTechnology languageTechnology){
        boolean exist = false;
        List<LanguageTechnology> languageTechnologies = languageTechRepository.findAll();
        for (LanguageTechnology lngTech : languageTechnologies){
            if (languageTechnology.getName().toLowerCase().equals(lngTech.getName().toLowerCase())) {
                if(languageTechnology.getLanguage().equals(lngTech.getLanguage())){
                    exist = true;
                    return exist;
                }
            }
        }
        return exist;
    }
}
