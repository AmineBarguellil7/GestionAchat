package tn.esprit.gestionachat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class GestionAchatApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestionAchatApplication.class, args);
    }
}
