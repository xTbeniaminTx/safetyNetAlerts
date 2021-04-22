package tolan.me.sna.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tolan.me.sna.models.Person;
import tolan.me.sna.services.PersonService;

@RestController
@RequestMapping("/medicalRecord")
public class MedicalRecordRestController {

  @Autowired
  PersonService personService;


  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createPerson(@RequestBody Person person) throws Exception {
    personService.createPerson(person);
  }

}
