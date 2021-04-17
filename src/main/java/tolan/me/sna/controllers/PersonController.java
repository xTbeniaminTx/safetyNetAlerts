package tolan.me.sna.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tolan.me.sna.dao.PersonRepository;
import tolan.me.sna.models.Person;

@Controller
@RequestMapping("/persons")
public class PersonController {

  @Autowired
  PersonRepository personRepo;

  @GetMapping("/new")
  public String displayPersonForm(Model model) {
    model.addAttribute("person", new Person());

    return "new-person";
  }

  @PostMapping("/save")
  public String createPerson(Person person) {
    personRepo.save(person);

    return "redirect:/persons/new";
  }

}
