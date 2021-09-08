package testapp.models.events;

import lombok.Data;

@Data
public class AgentStateChangedEvent extends BaseEvent{
    private String state;
    private String reason;
}
