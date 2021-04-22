package tolan.me.sna.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tolan.me.sna.dao.PersonRepository;
import tolan.me.sna.models.Person;

@Service
public class PersonService {

  @Autowired
  PersonRepository personRepo;

  public void createPerson(Person person) throws Exception {
    List<Person> allPersons = (List<Person>) personRepo.findAll();
    if (allPersons.contains(person)){
      throw new Exception("The person is already registered");
    } else {
      personRepo.save(person);
    }
  }
}
