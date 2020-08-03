package tam.rentalcars.service.car.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.car.interfaces.ICarDAO;
import tam.rentalcars.model.Car;
import tam.rentalcars.service.car.interfaces.ICarService;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    private final ICarDAO interfaceDAO;

    @Autowired
    public CarServiceImpl(@Qualifier("mongodb") ICarDAO iCarDAO) {
        this.interfaceDAO = iCarDAO;
    }

    @Override
    public Car create(Car car) {
        return interfaceDAO.create(car);
    }

    @Override
    public Car get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public Car update(Car car) {
        return interfaceDAO.update(car);
    }

    @Override
    public Car delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<Car> getAll() {
        return interfaceDAO.getAll();
    }
}
