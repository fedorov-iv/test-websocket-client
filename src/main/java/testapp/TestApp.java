package testapp;

import com.google.gson.Gson;
import testapp.models.events.*;

import java.net.URI;
import java.net.URISyntaxException;

public class TestApp {

    private static Gson gson = new Gson();

    public static void main(String[] args) {



        try {
            // open websocket
            final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(new URI("ws://<hostname>:<port>/ws"));

            // add listener
            clientEndPoint.addMessageHandler(new WebsocketClientEndpoint.MessageHandler() {
                public void handleMessage(String message) {
                    BaseEvent baseEvent = gson.fromJson(message, BaseEvent.class);
                    switch (baseEvent.getEvent()){
                        case "ChannelOccupied": {
                            ChannelOccupiedEvent channelOccupiedEvent = gson.fromJson(message, ChannelOccupiedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "CallActive": {
                            CallActiveEvent callActiveEvent = gson.fromJson(message, CallActiveEvent.class);
                            // some logic here...
                            break;
                        }
                        case "CallInactive": {
                            CallInactiveEvent callInactiveEvent = gson.fromJson(message, CallInactiveEvent.class);
                            // some logic here...
                            break;
                        }
                        case "CallInitiated": {
                            CallInitiatedEvent callInitiatedEvent = gson.fromJson(message, CallInitiatedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "ConferenceEstablished": {
                            ConferenceEstablishedEvent conferenceEstablishedEvent = gson.fromJson(message, ConferenceEstablishedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "DestinationConnected": {
                            DestinationConnectedEvent destinationConnectedEvent = gson.fromJson(message, DestinationConnectedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "OperationFailed": {
                            OperationFailedEvent operationFailedEvent = gson.fromJson(message, OperationFailedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "AgentStateChanged": {
                            AgentStateChangedEvent agentStateChangedEvent = gson.fromJson(message, AgentStateChangedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "TransferCancel": {
                            TransferCancelEvent transferCancelEvent = gson.fromJson(message, TransferCancelEvent.class);
                            // some logic here...
                            break;
                        }
                        case "SessionStateChanged": {
                            SessionStateChangeEvent sessionStateChangeEvent = gson.fromJson(message, SessionStateChangeEvent.class);
                            // some logic here...
                            break;
                        }
                        case "ChannelIdle": {
                            ChannelIdleEvent channelIdleEvent = gson.fromJson(message, ChannelIdleEvent.class);
                            // some logic here...
                            break;
                        }
                        case "CallDisconnected": {
                            CallDisconnectedEvent callDisconnected = gson.fromJson(message, CallDisconnectedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "CallTransferred": {
                            CallTransferredEvent callTransferred = gson.fromJson(message, CallTransferredEvent.class);
                            // some logic here...
                            break;
                        }
                        case "ConnectionStatusChanged": {
                            ConnectionStatusChangedEvent connectionStatusChanged = gson.fromJson(message, ConnectionStatusChangedEvent.class);
                            // some logic here...
                            break;
                        }
                        case "SessionShutdown": {
                            SessionShutdownEvent sessionShutdown = gson.fromJson(message, SessionShutdownEvent.class);
                            // some logic here...
                            break;
                        }
                        case "ConferenceCancel": {
                            ConferenceCancelEvent conferenceCancel = gson.fromJson(message, ConferenceCancelEvent.class);
                            // some logic here...
                            break;
                        }
                        case "ConferenceConfirmed": {
                            ConferenceConfirmedEvent conferenceConfirmed = gson.fromJson(message, ConferenceConfirmedEvent.class);
                            // some logic here...
                            break;
                        }

                        default:
                            System.out.println("Event not supported");
                            break;

                    }
                }
            });

            // send login message to websocket
            clientEndPoint.sendMessage("{\"command\": \"login\", \"parameters\":{\"agentId\":\"agtstep\", \"pwd\": \"Step_12345\", \"stationId\": \"1150\"}}");

            // send logout message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"logout\", \"parameters\":{\"agentId\":\"agtstep\", \"reasonCode\": \"0\"}}");

            // send changeAgentState message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"changeAgentState\", \"parameters\":{\"agentId\":\"agtstep\", \"agentState\": \"test\", \"reasonCode\": \"test\"}}");

            // send makeCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"makeCall\", \"parameters\":{\"agentId\":\"agtstep\", \"dest\": \"test\"}}");

            // send getCurrentCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"getCurrentCall\", \"parameters\":{\"agentId\":\"agtstep\"}}");

            // send holdCurrentCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"holdCurrentCall\", \"parameters\":{\"agentId\":\"agtstep\", \"callId\": \"0\"}}");

            // send unholdCurrentCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"unholdCurrentCall\", \"parameters\":{\"agentId\":\"agtstep\", \"callId\": \"0\"}}");

            // send transferCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"transferCall\", \"parameters\":{\"agentId\":\"agtstep\", \"dest\": \"test\", \"collaborationComment\": \"test\"}}");

            // send makeConference message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"makeConference\", \"parameters\":{\"agentId\":\"agtstep\", \"dest\": \"test\", \"collaborationComment\": \"test\"}}");

            // send makeConsult message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"makeConsult\", \"parameters\":{\"agentId\":\"agtstep\", \"dest\": \"test\", \"collaborationComment\": \"test\"}}");

            // send acceptCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"acceptCall\", \"parameters\":{\"agentId\":\"agtstep\", \"callId\": \"0\"}}");

            // send releaseCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"releaseCall\", \"parameters\":{\"agentId\":\"agtstep\", \"callId\": \"test\", \"reasonCode\": \"test\"}}");

            // send completeCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"completeCall\", \"parameters\":{\"agentId\":\"agtstep\", \"callId\": \"test\", \"categoryGroupCode\": null, \"wrapUpCategoryCode\": null, \"wrapUpReasonCode\": null, \"wrapUpOutcomeCode\": null, \"timeOutTimer\": 100}}");

            // send getWrapupCodes message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"getWrapupCodes\", \"parameters\":{\"agentId\":\"agtstep\"}}");

            // send completeConference message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"completeConference\", \"parameters\":{\"agentId\":\"agtstep\", \"confirm\": true}}");

            // send completeConsult message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"completeConsult\", \"parameters\":{\"agentId\":\"agtstep\", \"confirm\": true}}");

            // send getCall message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"getCall\", \"parameters\":{\"agentId\":\"agtstep\", \"callId\": \"test\"}}");

            // send getAgentState message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"getAgentState\", \"parameters\":{\"agentId\":\"agtstep\"}}");

            // send getCurrentEmail message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"getCurrentEmail\", \"parameters\":{\"agentId\":\"agtstep\", \"emailId\": \"test\"}}");

            // send getCurrentChat message to websocket
            //clientEndPoint.sendMessage("{\"command\": \"getCurrentChat\", \"parameters\":{\"agentId\":\"agtstep\", \"callId\": \"test\"}}");

            // wait 5 seconds for messages from websocket
            Thread.sleep(5000);

        } catch (InterruptedException ex) {
            System.err.println("InterruptedException exception: " + ex.getMessage());
        } catch (URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
    }
}