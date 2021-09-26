package myGroup.myArtifact.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> findAllPersons() { return personRepository.findAll(); }

    public Person createPerson(Person person) { return personRepository.save(person); }
}
