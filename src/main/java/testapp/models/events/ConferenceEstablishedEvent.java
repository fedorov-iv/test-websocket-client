package testapp.models.events;


import lombok.Data;

@Data
public class ConferenceEstablishedEvent extends BaseEvent{
    private String callId;
    private String addedNumber;
}
