package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.List;
import lombok.Data;

@Data
public class BootstrapStaticModel {

    private List<EventModel> events;
    private List<TeamModel> teams;
    private List<ElementModel> elements;
    private List<ElementTypeModel> element_types;

}