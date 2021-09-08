package testapp.models.events;

import lombok.Data;

@Data
public class CallActiveEvent extends BaseEvent{
    private String callId;
}
