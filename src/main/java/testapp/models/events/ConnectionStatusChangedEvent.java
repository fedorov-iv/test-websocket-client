package testapp.models.events;

import lombok.Data;

@Data
public class ConnectionStatusChangedEvent extends BaseEvent{
    private String state;

}
