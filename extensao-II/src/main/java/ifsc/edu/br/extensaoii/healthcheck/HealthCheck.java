package ifsc.edu.br.extensaoii.healthcheck;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @Autowired
    private UserRepo repo;

    @Autowired
    private Flyway flyway;

    @RequestMapping("/health")
    public String healthCheck() {
        repo.findAll();

        return "OK";
    }
}
