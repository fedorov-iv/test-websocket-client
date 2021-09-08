package testapp.models.events;

import lombok.Data;

/**
 * Модель базового события
 */
@Data
public class BaseEvent {
    private String event;
    private String agentId;
    private String stationId;
    private Long mask;
}
