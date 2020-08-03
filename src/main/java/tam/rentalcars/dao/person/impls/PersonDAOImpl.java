package tam.rentalcars.dao.person.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.person.interfaces.IPersonDAO;
import tam.rentalcars.model.Person;
import tam.rentalcars.repository.mongo.PersonRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class PersonDAOImpl implements IPersonDAO {

    private final PersonRepositoryMongo repository;

    public PersonDAOImpl(PersonRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public Person create(Person person) {
        return repository.save(person);
    }

    @Override
    public Person get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Person update(Person person) {
        return repository.save(person);
    }

    @Override
    public Person delete(String id) {
        Person person = this.get(id);
        repository.delete(person);
        return person;
    }

    @Override
    public List<Person> getAll() {
        return repository.findAll();
    }
}
