package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;
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
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/getId/{id}")
    public Language getId(@PathVariable int id){
        return languageService.getId(id);
    }

    @PostMapping("/add-language")
    public void add(@RequestBody Language language) {
         languageService.add(language);
    }

    @DeleteMapping("/delete-language")
    public void delete(@RequestParam int id) {
        languageService.delete(id);
    }

    @PutMapping("/update-language")
    public void update(@RequestBody Language language){
        languageService.update(language);
    }

}
