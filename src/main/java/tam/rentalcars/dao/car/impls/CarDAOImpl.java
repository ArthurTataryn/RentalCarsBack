package tam.rentalcars.dao.car.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.car.interfaces.ICarDAO;
import tam.rentalcars.model.Car;
import tam.rentalcars.repository.mongo.CarRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class CarDAOImpl implements ICarDAO {

    private final CarRepositoryMongo repository;

    public CarDAOImpl(CarRepositoryMongo carRepository) {
        this.repository = carRepository;
    }

    @Override
    public Car create(Car car) {
        return repository.save(car);
    }

    @Override
    public Car get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Car update(Car car) {
        return repository.save(car);
    }

    @Override
    public Car delete(String id) {
        Car car = this.get(id);
        repository.delete(car);
        return car;
    }

    @Override
    public List<Car> getAll() {
        return repository.findAll();
    }
}
