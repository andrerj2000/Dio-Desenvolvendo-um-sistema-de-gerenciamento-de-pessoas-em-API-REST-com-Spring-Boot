package one.digitalInovation.personApp.controller;


import one.digitalInovation.personApp.dto.MessageResponseDTO;
import one.digitalInovation.personApp.dto.request.PersonDTO;
import one.digitalInovation.personApp.entity.Person;
import one.digitalInovation.personApp.repository.PersonRepository;
import one.digitalInovation.personApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody /*@Valid*/ PersonDTO personDTO){
       return personService.createPerson(personDTO);

    }

    @GetMapping
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public PersonDTO findByIdd(@PathVariable Long id){
        return  personService.findById(id);
    }
}
