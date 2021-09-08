package testapp.models.events;

import lombok.Data;

@Data
public class ChannelOccupiedEvent extends BaseEvent{
    private String state;
    private String callId;
    private String collaborationComment;
}
