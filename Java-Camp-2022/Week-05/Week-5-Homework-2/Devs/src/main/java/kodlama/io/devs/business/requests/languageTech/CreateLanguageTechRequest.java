package kodlama.io.devs.business.requests.languageTech;

import kodlama.io.devs.business.abstracts.LanguageTechService;
import kodlama.io.devs.entities.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageTechRequest {
    private String name;
    private int languageId;

}
