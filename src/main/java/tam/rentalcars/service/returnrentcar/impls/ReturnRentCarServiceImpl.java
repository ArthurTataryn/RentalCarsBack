package tam.rentalcars.service.returnrentcar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.returnrentcar.interfaces.IReturnRentCarDAO;
import tam.rentalcars.model.ReturnRentCar;
import tam.rentalcars.service.returnrentcar.interfaces.IReturnRentCarService;

import java.util.List;

@Service
public class ReturnRentCarServiceImpl implements IReturnRentCarService {

    private final IReturnRentCarDAO interfaceDAO;

    public ReturnRentCarServiceImpl(@Qualifier("mongodb") IReturnRentCarDAO iReturnRentCarDAO) {
        this.interfaceDAO = iReturnRentCarDAO;
    }

    @Override
    public ReturnRentCar create(ReturnRentCar returnRentCar) {
        return interfaceDAO.create(returnRentCar);
    }

    @Override
    public ReturnRentCar get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public ReturnRentCar update(ReturnRentCar returnRentCar) {
        return interfaceDAO.update(returnRentCar);
    }

    @Override
    public ReturnRentCar delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<ReturnRentCar> getAll() {
        return interfaceDAO.getAll();
    }
}
