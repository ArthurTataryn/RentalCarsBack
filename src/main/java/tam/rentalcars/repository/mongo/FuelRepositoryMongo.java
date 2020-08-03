package tam.rentalcars.repository.mongo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.Fuel;

@Repository
public interface FuelRepositoryMongo extends MongoRepository<Fuel, String> {
}
