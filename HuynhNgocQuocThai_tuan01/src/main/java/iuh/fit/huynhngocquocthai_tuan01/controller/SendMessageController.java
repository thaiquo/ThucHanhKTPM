package iuh.fit.huynhngocquocthai_tuan01.controller;

import iuh.fit.huynhngocquocthai_tuan01.producer.MessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    private final MessageProducer producer;

    public SendMessageController(MessageProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/send")
    public String send(@RequestParam String msg) {
        producer.send(msg);
        return "Message sent to RabbitMQ: " + msg;
    }
}
