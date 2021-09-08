package testapp.models.events;

import lombok.Data;

@Data
public class DestinationConnectedEvent extends BaseEvent{
    private String callId;
}
