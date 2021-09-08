package testapp.models.events;

import lombok.Data;

@Data
public class ConferenceCancelEvent extends BaseEvent{
    private String callId;
}
