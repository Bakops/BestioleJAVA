package fr.epsi.b3devc1.bestioles.repository;
import fr.epsi.b3devc1.bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SpeciesRepository extends JpaRepository<Species, Integer> {
    Optional<Species> findFirstByCommonName(String commonName);
    List<Species> findByLatinNameContainingIgnoreCase(String latinName);
}
