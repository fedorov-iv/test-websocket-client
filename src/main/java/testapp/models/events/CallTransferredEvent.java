package testapp.models.events;

import lombok.Data;

@Data
public class CallTransferredEvent extends BaseEvent{
    private String callId;
}
