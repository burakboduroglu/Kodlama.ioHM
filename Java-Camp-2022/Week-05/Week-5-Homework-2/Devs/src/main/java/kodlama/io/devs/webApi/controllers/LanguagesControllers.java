package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.language.GetAllLanguagesResponse;
import kodlama.io.devs.business.responses.language.GetLanguagesByIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/languages")
@RestController
public class LanguagesControllers {
    private LanguageService languageService;

    @Autowired
    public LanguagesControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add-language")
    public void add(CreateLanguageRequest createLanguageRequest) {
         languageService.add(createLanguageRequest);
    }

    @PutMapping("/update-language")
    public void update(UpdateLanguageRequest updateLanguageRequest){
        languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("/delete-language")
    public void delete(DeleteLanguageRequest deleteLanguageRequest){
        languageService.delete(deleteLanguageRequest);
    }

    @GetMapping("/getId/{id}")
    public GetLanguagesByIdResponse getById(@PathVariable int id){
        return languageService.getId(id);
    }
}
