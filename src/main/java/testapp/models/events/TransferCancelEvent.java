package testapp.models.events;

import lombok.Data;

@Data
public class TransferCancelEvent extends BaseEvent{
    private String callId;
}
