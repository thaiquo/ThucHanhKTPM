package iuh.fit.huynhngocquocthai_tuan01.controller;

import iuh.fit.huynhngocquocthai_tuan01.producer.MessageProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final MessageProducer producer;

    public HelloController(MessageProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String msg) {
        producer.sendMessage(msg);
        return "Message sent to RabbitMQ!";
    }
}
