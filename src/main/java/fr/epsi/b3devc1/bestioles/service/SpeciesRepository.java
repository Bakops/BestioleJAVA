package fr.epsi.b3devc1.bestioles.service;
import fr.epsi.b3devc1.bestioles.model.Animal;
import fr.epsi.b3devc1.bestioles.model.Species;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SpeciesRepository {
    private final fr.epsi.b3devc1.bestioles.service.SpeciesRepository speciesService;

    public SpeciesRepository(fr.epsi.b3devc1.bestioles.service.SpeciesRepository speciesRepository) {
        this.speciesService = speciesRepository;
    }

    public List<Species> findAll() {
        return speciesService.findAll();
    }

    public Optional<Species> findById(Long id) {
        return speciesService.findById(id);
    }

    public Species save(Species person) {
        return speciesService.save(person);
    }

    public void delete(Long id) {
        speciesService.deleteById(id);
    }
}
