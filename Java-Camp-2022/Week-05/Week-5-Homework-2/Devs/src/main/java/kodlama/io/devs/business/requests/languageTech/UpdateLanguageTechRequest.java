package kodlama.io.devs.business.requests.languageTech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageTechRequest {
    private int id;
    private String name;
    private int languageId;
}
