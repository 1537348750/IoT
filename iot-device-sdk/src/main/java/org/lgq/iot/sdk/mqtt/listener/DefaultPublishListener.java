package org.lgq.iot.sdk.mqtt.listener;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

import java.nio.charset.StandardCharsets;

@Slf4j
public class DefaultPublishListener implements IMqttActionListener {

    private byte[] payload;

    public DefaultPublishListener(byte[] payload) {
        this.payload = payload;
    }

    @Override
    public void onSuccess(IMqttToken iMqttToken) {
        log.info("Publish mqtt message success, topic={}, message={}", iMqttToken.getTopics()[0], new String(payload, StandardCharsets.UTF_8));
    }

    @Override
    public void onFailure(IMqttToken iMqttToken, Throwable e) {
        log.error("Publish mqtt message fail, topic={}, message={}", iMqttToken.getTopics()[0], new String(payload, StandardCharsets.UTF_8), e);
    }
}