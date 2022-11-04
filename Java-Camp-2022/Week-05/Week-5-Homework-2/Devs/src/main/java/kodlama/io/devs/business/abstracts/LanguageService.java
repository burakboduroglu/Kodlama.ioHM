package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.language.GetAllLanguagesResponse;
import kodlama.io.devs.business.responses.language.GetLanguagesByIdResponse;


import java.util.List;

public interface LanguageService {
     List<GetAllLanguagesResponse> getAll();
     void add(CreateLanguageRequest createBrandRequest);
     void update(UpdateLanguageRequest updateLanguageRequest);
     void delete(DeleteLanguageRequest deleteLanguageRequest);
     GetLanguagesByIdResponse getId(int id);
}
