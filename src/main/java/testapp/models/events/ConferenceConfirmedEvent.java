package testapp.models.events;

import lombok.Data;

@Data
public class ConferenceConfirmedEvent extends BaseEvent{
    private String callId;
}
