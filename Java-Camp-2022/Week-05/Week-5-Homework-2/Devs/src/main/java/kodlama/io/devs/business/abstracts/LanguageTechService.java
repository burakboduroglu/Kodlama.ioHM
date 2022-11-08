package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.languageTech.CreateLanguageTechRequest;
import kodlama.io.devs.business.requests.languageTech.DeleteLanguageTechRequest;
import kodlama.io.devs.business.requests.languageTech.UpdateLanguageTechRequest;
import kodlama.io.devs.business.responses.languageTech.GetAllLanguageTechsResponse;
import kodlama.io.devs.business.responses.languageTech.GetLanguageTechByIdResponse;

import java.util.List;


public interface LanguageTechService {
    void add(CreateLanguageTechRequest createLanguageTechRequest);
    List<GetAllLanguageTechsResponse> getAll();
    void delete(DeleteLanguageTechRequest deleteLanguageTechRequest);
    GetLanguageTechByIdResponse getId(int id);
    void update(UpdateLanguageTechRequest updateLanguageTechRequest);
}
