package tam.rentalcars.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.RentCar;

@Repository
public interface RentCarRepositoryMongo extends MongoRepository<RentCar, String> {
}
