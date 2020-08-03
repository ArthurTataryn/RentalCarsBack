package tam.rentalcars.service.customer.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.auth.IApplicationUserDAO;
import tam.rentalcars.dao.customer.interfaces.ICustomerDAO;
import tam.rentalcars.model.Customer;
import tam.rentalcars.service.customer.interfaces.ICustomerService;
import tam.rentalcars.service.person.interfaces.IPersonService;

import java.util.List;

import static tam.rentalcars.security.ApplicationUserRole.*;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerDAO interfaceDAO;
    private final IPersonService iPersonService;
    private final IApplicationUserDAO iApplicationUserDAO;

    public CustomerServiceImpl(@Qualifier("mongodb") ICustomerDAO iCustomerDAO,
                               IPersonService iPersonService,
                               IApplicationUserDAO iApplicationUserDAO) {

        this.interfaceDAO = iCustomerDAO;
        this.iPersonService = iPersonService;
        this.iApplicationUserDAO = iApplicationUserDAO;
    }

    @Override
    public Customer create(Customer customer) {
        customer.setPerson(iPersonService.create(customer.getPerson()));
        customer.getApplicationUser().setAuthorities(USER.getGrantedAuthorities());
        customer.setApplicationUser(iApplicationUserDAO.create(customer.getApplicationUser()));
        return interfaceDAO.create(customer);
    }

    @Override
    public Customer get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public Customer update(Customer customer) {
        iPersonService.update(customer.getPerson());
        customer.setApplicationUser(iApplicationUserDAO.create(customer.getApplicationUser()));
        return interfaceDAO.update(customer);
    }

    @Override
    public Customer delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        return interfaceDAO.getAll();
    }
}
