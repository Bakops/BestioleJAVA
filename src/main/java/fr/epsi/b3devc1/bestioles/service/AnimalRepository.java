package fr.epsi.b3devc1.bestioles.service;
import fr.epsi.b3devc1.bestioles.model.Animal;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalRepository {
    private final fr.epsi.b3devc1.bestioles.service.AnimalRepository animalService;

    public AnimalRepository(fr.epsi.b3devc1.bestioles.service.PersonRepository personRepository) {
        this.animalService = AnimalRepository;
    }

    public List<Animal> findAll() {
        return animalService.findAll();
    }

    public Optional<Animal> findById(Long id) {
        return animalService.findById(id);
    }

    public Animal save(Animal person) {
        return animalService.save(person);
    }

    public void delete(Long id) {
        animalService.deleteById(id);
    }
}
