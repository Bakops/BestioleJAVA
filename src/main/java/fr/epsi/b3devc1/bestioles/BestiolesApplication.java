package fr.epsi.b3devc1.bestioles;

import fr.epsi.b3devc1.bestioles.model.Person;
import fr.epsi.b3devc1.bestioles.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class BestiolesApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Liste initiale des personnes : " + personRepository.findAll());

        // save()
        Person p1 = new Person();
        p1.setFirstname("Toure");
        p1.setLastname("Bakou");
        p1.setAge(30);
        personRepository.save(p1);

        Person p2 = new Person();
        p2.setFirstname("Toure");
        p2.setLastname("Baks");
        p2.setAge(40);
        personRepository.save(p2);

        System.out.println("Liste après ajout : " + personRepository.findAll());


        Optional<Person> foundPerson = personRepository.findById(p1.getId());
        foundPerson.ifPresent(person -> System.out.println("Personne trouvée : " + person));


        personRepository.delete(p1);
        System.out.println("Liste après suppression : " + personRepository.findAll());
    }
}
