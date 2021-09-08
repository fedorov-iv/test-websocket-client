package testapp.models.events;

import lombok.Data;

@Data
public class SessionStateChangeEvent extends BaseEvent{
    private String state;
}
