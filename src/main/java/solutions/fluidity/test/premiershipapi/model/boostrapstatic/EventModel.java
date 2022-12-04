package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import solutions.fluidity.test.premiershipapi.model.fixtures.FixtureModel;

import java.util.List;

import lombok.Data;

@Data
public class EventModel {
    private Long id;
    private String name;
    private String deadline_time;
    private String average_entry_score;
    private Boolean finished;
    private String data_checked;
    private String highest_scoring_entry;
    private Long deadline_time_epoch;
    private String deadline_time_game_offset;
    private String highest_score;
    private String is_previous;
    private Boolean is_current;
    private String is_next;
    private List<FixtureModel> fixtures;
    private List<ElementModel> goalKeepers;
    private List<ElementModel> forwards;
    private List<ElementModel> defenders;
    private  List<ElementModel> midfielders;

}