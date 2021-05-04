package tolan.me.sna.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tolan.me.sna.controllers.api.dto.PersonInfoDto;
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

  public PersonInfoDto getInfo(String firstName, String lastName) {
    Person byFirstNameAndLastName = personRepo.findByFirstNameAndLastName(firstName, lastName);
    PersonInfoDto personInfoDto = new PersonInfoDto();
    personInfoDto.setFirstName(byFirstNameAndLastName.getFirstName());
    personInfoDto.setLastName(byFirstNameAndLastName.getLastName());

    return personInfoDto;
  }
}
