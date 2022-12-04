package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TeamModel {
    private Long code;
    private Long id;
    private String name;
    private String short_name;
    private String unavailable;
    private List<ElementModel> elements;

}