package tam.rentalcars.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.rentalcars.model.CompanyCar;

@Repository
public interface CompanyCarRepositoryMongo extends MongoRepository<CompanyCar, String> {
}
