package testapp.models.events;

import lombok.Data;

@Data
public class SessionShutdownEvent extends BaseEvent{
    private String reason;
}
