package fr.epsi.b3devc1.bestioles.repository;
import fr.epsi.b3devc1.bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, Integer> {
}
