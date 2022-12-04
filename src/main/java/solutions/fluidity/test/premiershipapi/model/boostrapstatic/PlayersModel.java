package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.List;
import lombok.Data;

@Data
public class PlayersModel {
    private List<ElementModel> goalKeepers;
    private List<ElementModel> forwards;
    private List<ElementModel> defenders;
    private  List<ElementModel> midfielders;
}
