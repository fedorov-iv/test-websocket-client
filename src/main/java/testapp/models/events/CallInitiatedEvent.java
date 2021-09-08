package testapp.models.events;


import lombok.Data;

@Data
public class CallInitiatedEvent extends BaseEvent{
    private String callId;
    private String type;
    private String dnis;
    private String ani;
}
