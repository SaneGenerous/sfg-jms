package tp.msk.sfgjms.listener;

import jakarta.jms.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import tp.msk.sfgjms.config.JmsConfig;
import tp.msk.sfgjms.model.HelloWorldMessage;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){
        System.out.println("I Got a Message!!!!!");

        System.out.println(helloWorldMessage);
    }
}
