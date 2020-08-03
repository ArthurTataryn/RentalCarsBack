package tam.rentalcars.service.fuel.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.fuel.interfaces.IFuelDAO;
import tam.rentalcars.model.Fuel;
import tam.rentalcars.service.fuel.interfaces.IFuelService;

import java.util.List;

@Service
public class FuelServiceImpl implements IFuelService {

    private final IFuelDAO interfaceDAO;

    @Autowired
    public FuelServiceImpl(@Qualifier("mongodb") IFuelDAO iFuelDAO) {
        this.interfaceDAO = iFuelDAO;
    }

    @Override
    public Fuel create(Fuel fuel) {
        return interfaceDAO.create(fuel);
    }

    @Override
    public Fuel get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public Fuel update(Fuel fuel) {
        return interfaceDAO.update(fuel);
    }

    @Override
    public Fuel delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<Fuel> getAll() {
        return interfaceDAO.getAll();
    }
}
