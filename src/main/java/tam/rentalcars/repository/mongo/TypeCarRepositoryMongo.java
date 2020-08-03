package tam.rentalcars.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.TypeCar;

@Repository
public interface TypeCarRepositoryMongo extends MongoRepository<TypeCar, String> {
}
