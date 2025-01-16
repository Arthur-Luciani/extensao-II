package ifsc.edu.br.extensaoii.rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    private final PubService pubService;

    @Autowired
    public RabbitController(PubService pubService) {
        this.pubService = pubService;
    }

    @GetMapping("/rabbit")
    public void sendMessage(@Param(value = "message") String message) {
        pubService.sendMessage(message);
    }
}
