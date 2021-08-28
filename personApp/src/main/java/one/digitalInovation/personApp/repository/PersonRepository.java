package one.digitalInovation.personApp.repository;

import one.digitalInovation.personApp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
