package kodlama.io.devs.business.responses.languageTech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetLanguageTechByIdResponse {
    private int id;
    private String name;
    private String language;
}
