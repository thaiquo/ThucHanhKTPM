package iuh.fit.huynhngocquocthai_tuan01.consumer;

import iuh.fit.huynhngocquocthai_tuan01.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String message) {
        System.out.println("📥 Received message: " + message);
    }
}
