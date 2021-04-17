package tolan.me.sna.dao;

import org.springframework.data.repository.CrudRepository;
import tolan.me.sna.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
