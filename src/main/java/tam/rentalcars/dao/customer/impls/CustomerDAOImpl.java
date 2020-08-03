package tam.rentalcars.dao.customer.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.customer.interfaces.ICustomerDAO;
import tam.rentalcars.model.Customer;
import tam.rentalcars.repository.mongo.CustomerRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class CustomerDAOImpl implements ICustomerDAO {

    private final CustomerRepositoryMongo repository;

    public CustomerDAOImpl(CustomerRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer delete(String id) {
        Customer customer = this.get(id);
        repository.delete(customer);
        return customer;
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
