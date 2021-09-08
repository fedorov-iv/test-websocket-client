package testapp.models.events;

import lombok.Data;

@Data
public class CallDisconnectedEvent extends BaseEvent{
    private String callId;
}
