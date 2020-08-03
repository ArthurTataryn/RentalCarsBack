package tam.rentalcars.service.person.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.person.interfaces.IPersonDAO;
import tam.rentalcars.model.Person;
import tam.rentalcars.service.person.interfaces.IPersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDAO interfaceDAO;

    public PersonServiceImpl(@Qualifier("mongodb") IPersonDAO iPersonDAO) {
        this.interfaceDAO = iPersonDAO;
    }

    @Override
    public Person create(Person person) {
        return interfaceDAO.create(person);
    }

    @Override
    public Person get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public Person update(Person person) {
        return interfaceDAO.update(person);
    }

    @Override
    public Person delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<Person> getAll() {
        return interfaceDAO.getAll();
    }
}
