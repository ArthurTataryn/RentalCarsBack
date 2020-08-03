package tam.rentalcars.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.Car;

@Repository
public interface CarRepositoryMongo extends MongoRepository<Car, String> {
}
