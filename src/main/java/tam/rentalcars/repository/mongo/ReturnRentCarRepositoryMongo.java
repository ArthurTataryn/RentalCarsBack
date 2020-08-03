package tam.rentalcars.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.ReturnRentCar;

@Repository
public interface ReturnRentCarRepositoryMongo extends MongoRepository<ReturnRentCar, String> {
}
