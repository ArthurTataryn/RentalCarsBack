package tam.rentalcars.service.typecar.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.typecar.interfaces.ITypeCarDAO;
import tam.rentalcars.model.TypeCar;
import tam.rentalcars.service.typecar.interfaces.ITypeCarService;

import java.util.List;

@Service
public class TypeCarServiceImpl implements ITypeCarService {

    private final ITypeCarDAO interfaceDAO;

    @Autowired
    public TypeCarServiceImpl(@Qualifier("mongodb") ITypeCarDAO iTypeCarDAO) {
        this.interfaceDAO = iTypeCarDAO;
    }

    @Override
    public TypeCar create(TypeCar tupeCar) {
        return interfaceDAO.create(tupeCar);
    }

    @Override
    public TypeCar get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public TypeCar update(TypeCar tupeCar) {
        return interfaceDAO.update(tupeCar);
    }

    @Override
    public TypeCar delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<TypeCar> getAll() {
        return interfaceDAO.getAll();
    }
}
