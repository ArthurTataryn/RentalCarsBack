package tam.rentalcars.dao.returnrentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.returnrentcar.interfaces.IReturnRentCarDAO;
import tam.rentalcars.model.ReturnRentCar;
import tam.rentalcars.repository.mongo.ReturnRentCarRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class ReturnRentCarDAOImpl implements IReturnRentCarDAO {

    private final ReturnRentCarRepositoryMongo repository;

    public ReturnRentCarDAOImpl(ReturnRentCarRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public ReturnRentCar create(ReturnRentCar returnRentCar) {
        return repository.save(returnRentCar);
    }

    @Override
    public ReturnRentCar get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ReturnRentCar update(ReturnRentCar returnRentCar) {
        return repository.save(returnRentCar);
    }

    @Override
    public ReturnRentCar delete(String id) {
        ReturnRentCar returnRentCar = this.get(id);
        repository.delete(returnRentCar);
        return returnRentCar;
    }

    @Override
    public List<ReturnRentCar> getAll() {
        return repository.findAll();
    }
}
