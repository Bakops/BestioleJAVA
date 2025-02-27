package fr.epsi.b3devc1.bestioles.repository;
import fr.epsi.b3devc1.bestioles.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<fr.epsi.b3devc1.bestioles.model.Person, Integer> {
    List<Person> findByLastnameOrFirstname(String lastname, String firstname);
    List<Person> findByAgeGreaterThanEqual(int age);
}
