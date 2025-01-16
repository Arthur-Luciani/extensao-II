package ifsc.edu.br.extensaoii.healthcheck;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity (name = "users")
@Table (name = "users")
@Data
public class UserEntity {
    @Id
    @Column(name = "id")
    private Long id;

}
