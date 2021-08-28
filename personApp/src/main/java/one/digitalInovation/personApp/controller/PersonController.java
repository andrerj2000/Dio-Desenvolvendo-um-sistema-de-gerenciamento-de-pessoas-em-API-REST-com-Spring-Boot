package one.digitalInovation.personApp.controller;


import one.digitalInovation.personApp.dto.MessageResponseDTO;
import one.digitalInovation.personApp.entity.Person;
import one.digitalInovation.personApp.repository.PersonRepository;
import one.digitalInovation.personApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
       return personService.createPerson(person);
    }
}
