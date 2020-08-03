package tam.rentalcars.service.color.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.color.interfaces.IColorDAO;
import tam.rentalcars.model.Color;
import tam.rentalcars.service.color.interfaces.IColorService;


import java.util.List;

@Service
public class ColorServiceImpl implements IColorService {

    private final IColorDAO interfaceDAO;

    @Autowired
    public ColorServiceImpl(@Qualifier("mongodb") IColorDAO iColorDAO) {
        this.interfaceDAO = iColorDAO;
    }

    @Override
    public Color create(Color color) {
        return interfaceDAO.create(color);
    }

    @Override
    public Color get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public Color update(Color color) {
        return interfaceDAO.update(color);
    }

    @Override
    public Color delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<Color> getAll() {
        return interfaceDAO.getAll();
    }
}
