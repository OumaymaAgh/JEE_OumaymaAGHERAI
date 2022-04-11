package ma.enset.etudiantmvc;

import ma.enset.etudiantmvc.entities.Etudiant;
import ma.enset.etudiantmvc.entities.Genre;
import ma.enset.etudiantmvc.repositories.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class EtudiantMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtudiantMvcApplication.class, args);
    }
    @Bean
        // executer la methode au démarrage
    CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository){
        return args -> {
            etudiantRepository.save(new Etudiant(null,"oumayma","agherai","o.agherai@gmail.com" ,new Date() , Genre.FEMININ,false)) ;
            etudiantRepository.save(new Etudiant(null,"yassamine","sahl","y.sahl@gmail.com" ,new Date() , Genre.FEMININ,false)) ;

            etudiantRepository.findAll().forEach((etudiant -> {
                System.out.printf(etudiant.getNom() + "\n");
            }));

        };
    }
}
