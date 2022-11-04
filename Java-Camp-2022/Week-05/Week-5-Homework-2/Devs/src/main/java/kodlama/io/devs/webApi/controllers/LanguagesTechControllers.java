package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.LanguageTechService;
import kodlama.io.devs.business.requests.languageTech.CreateLanguageTechRequest;
import kodlama.io.devs.business.requests.languageTech.DeleteLanguageTechRequest;
import kodlama.io.devs.business.requests.languageTech.UpdateLanguageTechRequest;
import kodlama.io.devs.dataAccess.languageTech.GetAllLanguageTechsResponse;
import kodlama.io.devs.dataAccess.languageTech.GetLanguageTechByIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/languages-tech")
@RestController
public class LanguagesTechControllers {
    private LanguageTechService languageTechService;

    @Autowired
    public LanguagesTechControllers(LanguageTechService languageTechService) {
        this.languageTechService = languageTechService;
    }

    @PostMapping("/add-language-tech")
    public void add(CreateLanguageTechRequest createLanguageTechRequest){
        this.languageTechService.add(createLanguageTechRequest);
    }

    @GetMapping("/get-languageTechnologies")
    public List<GetAllLanguageTechsResponse> getAll(){
       return this.languageTechService.getAll();
    }

    @DeleteMapping("/delete-languageTechnologies")
    public void delete(DeleteLanguageTechRequest deleteLanguageTechRequest){
        this.languageTechService.delete(deleteLanguageTechRequest);
    }

    @GetMapping("/get-tech/{id}")
    public GetLanguageTechByIdResponse getId(@PathVariable int id){
        return this.languageTechService.getId(id);
    }

    @PutMapping("/update-tech")
    public void update(UpdateLanguageTechRequest updateLanguageTechRequest){
        this.languageTechService.update(updateLanguageTechRequest);
    }
}
