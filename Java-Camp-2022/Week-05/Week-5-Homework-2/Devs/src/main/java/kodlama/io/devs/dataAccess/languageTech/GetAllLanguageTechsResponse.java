package kodlama.io.devs.dataAccess.languageTech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllLanguageTechsResponse {
    private int id;
    private String name;
    private String language;
}
