package myGroup.myArtifact.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    public PersonService _personService;

    @GetMapping
    public List<Person> findAllPersons() { return _personService.findAllPersons(); }

    @PostMapping
    public Person createPerson(@RequestBody Person person) { return _personService.createPerson(person); }
}
