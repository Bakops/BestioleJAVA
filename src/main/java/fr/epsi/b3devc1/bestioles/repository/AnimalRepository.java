package fr.epsi.b3devc1.bestioles.repository;
import fr.epsi.b3devc1.bestioles.model.Animal;
import fr.epsi.b3devc1.bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    List<Animal> findBySpecies(Species species);
    List<Animal> findByColorIn(List<String> colors);
}
