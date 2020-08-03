package tam.rentalcars.repository.mongo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.Color;

@Repository
public interface ColorRepositoryMongo extends MongoRepository<Color, String> {
}
