package tn.esprit.gestionachat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GestionAchatApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestionAchatApplication.class, args);
    }
}
