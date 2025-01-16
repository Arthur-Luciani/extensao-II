package ifsc.edu.br.extensaoii.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SubService {

    @RabbitListener(queues = "myQueue")
    public void receiveMessage(String message) {
        System.out.println("Message received: " + message);
    }
}
