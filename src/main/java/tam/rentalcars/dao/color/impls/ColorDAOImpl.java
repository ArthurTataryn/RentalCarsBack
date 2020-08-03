package tam.rentalcars.dao.color.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.color.interfaces.IColorDAO;
import tam.rentalcars.model.Color;
import tam.rentalcars.repository.mongo.ColorRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class ColorDAOImpl implements IColorDAO {

    private final ColorRepositoryMongo repository;

    public ColorDAOImpl(ColorRepositoryMongo colorRepository) {
        this.repository = colorRepository;
    }

    @Override
    public Color create(Color color) {
        return repository.save(color);
    }

    @Override
    public Color get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Color update(Color color) {
        return repository.save(color);
    }

    @Override
    public Color delete(String id) {
        Color color = this.get(id);
        repository.delete(color);
        return color;
    }

    @Override
    public List<Color> getAll() {
        return repository.findAll();
    }
}
