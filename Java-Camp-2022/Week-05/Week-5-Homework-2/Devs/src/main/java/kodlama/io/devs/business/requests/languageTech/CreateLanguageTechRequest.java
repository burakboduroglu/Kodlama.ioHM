package kodlama.io.devs.business.requests.languageTech;

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
