package tam.rentalcars.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import tam.rentalcars.model.Customer;

public interface CustomerRepositoryMongo extends MongoRepository<Customer, String> {
}
