package testapp.models.events;

import lombok.Data;

@Data
public class CallInactiveEvent extends BaseEvent{
    private String callId;
}
