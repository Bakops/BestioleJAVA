package fr.epsi.b3devc1.bestioles.service;
import fr.epsi.b3devc1.bestioles.model.Person;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonRepository {
    private final fr.epsi.b3devc1.bestioles.service.PersonRepository personService;

    public PersonRepository(fr.epsi.b3devc1.bestioles.service.PersonRepository personRepository) {
        this.personService = personRepository;
    }

    public List<Person> findAll() {
        return personService.findAll();
    }

    public Optional<Person> findById(Long id) {
        return personService.findById(id);
    }

    public Person save(Person person) {
        return personService.save(person);
    }

    public void delete(Long id) {
        personService.deleteById(id);
    }
}
