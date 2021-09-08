package testapp.models.events;

import lombok.Data;

@Data
public class ChannelIdleEvent extends BaseEvent{

    private String callId;
}
