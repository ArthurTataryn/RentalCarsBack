package tam.rentalcars.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.Person;

@Repository
public interface PersonRepositoryMongo extends MongoRepository<Person, String> {
}
