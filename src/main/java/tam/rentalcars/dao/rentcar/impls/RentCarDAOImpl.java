package tam.rentalcars.dao.rentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.rentcar.interfaces.IRentCarDAO;
import tam.rentalcars.model.RentCar;
import tam.rentalcars.repository.mongo.RentCarRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class RentCarDAOImpl implements IRentCarDAO {

    private final RentCarRepositoryMongo repository;

    public RentCarDAOImpl(RentCarRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public RentCar create(RentCar rentCar) {
        return repository.save(rentCar);
    }

    @Override
    public RentCar get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public RentCar update(RentCar rentCar) {
        return repository.save(rentCar);
    }

    @Override
    public RentCar delete(String id) {
        RentCar rentCar = this.get(id);
        repository.delete(rentCar);
        return rentCar;
    }

    @Override
    public List<RentCar> getAll() {
        return repository.findAll();
    }
}
