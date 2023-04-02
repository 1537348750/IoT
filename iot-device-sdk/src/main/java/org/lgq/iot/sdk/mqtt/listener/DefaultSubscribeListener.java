package org.lgq.iot.sdk.mqtt.listener;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

@Slf4j
public class DefaultSubscribeListener implements IMqttActionListener {

    @Override
    public void onSuccess(IMqttToken iMqttToken) {
        log.info("Subscribe mqtt topic success, topic={}", iMqttToken.getTopics()[0]);
    }

    @Override
    public void onFailure(IMqttToken iMqttToken, Throwable e) {
        log.error("Subscribe mqtt topic fail, topic={}", iMqttToken.getTopics()[0], e);
    }
}
