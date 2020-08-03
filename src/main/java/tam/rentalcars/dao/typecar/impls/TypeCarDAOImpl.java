package tam.rentalcars.dao.typecar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.typecar.interfaces.ITypeCarDAO;
import tam.rentalcars.model.TypeCar;
import tam.rentalcars.repository.mongo.TypeCarRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class TypeCarDAOImpl implements ITypeCarDAO {

    private final TypeCarRepositoryMongo repository;

    public TypeCarDAOImpl(TypeCarRepositoryMongo typeCarRepository) {
        this.repository = typeCarRepository;
    }

    @Override
    public TypeCar create(TypeCar typeCar) {
        return repository.save(typeCar);
    }

    @Override
    public TypeCar get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public TypeCar update(TypeCar typeCar) {
        return repository.save(typeCar);
    }

    @Override
    public TypeCar delete(String id) {
        TypeCar typeCar = this.get(id);
        repository.delete(typeCar);
        return typeCar;
    }

    @Override
    public List<TypeCar> getAll() {
        return repository.findAll();
    }
}
