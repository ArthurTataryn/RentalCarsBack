package tam.rentalcars.dao.fuel.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.fuel.interfaces.IFuelDAO;
import tam.rentalcars.model.Fuel;
import tam.rentalcars.repository.mongo.FuelRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class FuelDAOImpl implements IFuelDAO {

    private final FuelRepositoryMongo repository;

    public FuelDAOImpl(FuelRepositoryMongo fuelRepository) {
        this.repository = fuelRepository;
    }

    @Override
    public Fuel create(Fuel fuel) {
        return repository.save(fuel);
    }

    @Override
    public Fuel get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Fuel update(Fuel fuel) {
        return repository.save(fuel);
    }

    @Override
    public Fuel delete(String id) {
        Fuel fuel = this.get(id);
        repository.delete(fuel);
        return fuel;
    }

    @Override
    public List<Fuel> getAll() {
        return repository.findAll();
    }
}
