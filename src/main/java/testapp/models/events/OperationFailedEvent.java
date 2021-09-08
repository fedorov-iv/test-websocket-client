package testapp.models.events;

import lombok.Data;

@Data
public class OperationFailedEvent extends BaseEvent{
    private String reason;
}
