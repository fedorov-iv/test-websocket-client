package testapp;

import java.net.URI;
import java.net.URISyntaxException;

public class TestApp {

    public static void main(String[] args) {
        try {
            // open websocket
            final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(new URI("ws://<hostname>:<port>/ws"));

            // add listener
            clientEndPoint.addMessageHandler(new WebsocketClientEndpoint.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);
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