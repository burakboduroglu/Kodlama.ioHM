package kodlama.io.devs.business.responses.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetLanguagesByIdResponse {
    private int id;
    private String name;
}
