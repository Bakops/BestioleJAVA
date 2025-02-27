package fr.epsi.b3devc1.bestioles.repository;
import fr.epsi.b3devc1.bestioles.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
