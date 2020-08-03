package tam.rentalcars.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.rentalcars.model.Customer;
import tam.rentalcars.service.customer.impls.CustomerServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customer")
public class CustomerRestController {

    CustomerServiceImpl service;

    @Autowired
    public CustomerRestController(CustomerServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public Customer delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create") // first name, middle name, last name, gender, address, phone, eMail
    public Customer create(@RequestBody Customer customer){
        return service.create(customer);
    }

    @PutMapping("/update") // customer id, person id, first name, middle name, last name, gender, address, phone, eMail, bonus, carList, rent
    public Customer update(@RequestBody Customer customer){
        return service.create(customer);
    }

    @GetMapping("/get/{id}")
    public Customer get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
