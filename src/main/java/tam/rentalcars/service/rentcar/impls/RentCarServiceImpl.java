package tam.rentalcars.service.rentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.rentcar.interfaces.IRentCarDAO;
import tam.rentalcars.model.RentCar;
import tam.rentalcars.service.rentcar.interfaces.IRentCarService;

import java.util.List;

@Service
public class RentCarServiceImpl implements IRentCarService {

    private final IRentCarDAO interfaceDAO;

    public RentCarServiceImpl(@Qualifier("mongodb") IRentCarDAO iRentCarDAO) {
        this.interfaceDAO = iRentCarDAO;
    }

    @Override
    public RentCar create(RentCar rentCar) {
        return interfaceDAO.create(rentCar);
    }

    @Override
    public RentCar get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public RentCar update(RentCar rentCar) {
        return interfaceDAO.update(rentCar);
    }

    @Override
    public RentCar delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<RentCar> getAll() {
        return interfaceDAO.getAll();
    }
}
