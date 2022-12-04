package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.List;
import lombok.Data;

@Data
public class ElementTypeModel {
    private Long id;
    private String plural_name;
    private String plural_name_short;
    private String singular_name;
    private String singular_name_short;
    private Long squad_select;
    private Long squad_min_play;
    private Long squad_max_play;
    private String ui_shirt_specific;
    private List<Long> sub_positions_locked;
    private Long element_count;

}