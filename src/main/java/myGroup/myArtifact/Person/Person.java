package myGroup.myArtifact.Person;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long _id;

    private String _person_name;
    private Long _age;

    public Person(){}

    public Person(Long id, String person_name, Long age){
        this._id = id;
        this._person_name = person_name;
        this._age = age;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String get_person_name() {
        return _person_name;
    }

    public void set_person_name(String _person_name) {
        this._person_name = _person_name;
    }

    public Long get_age() {
        return _age;
    }

    public void set_age(Long _age) {
        this._age = _age;
    }
}
