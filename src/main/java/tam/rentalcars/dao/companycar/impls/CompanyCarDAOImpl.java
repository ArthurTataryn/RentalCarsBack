package tam.rentalcars.dao.companycar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tam.rentalcars.dao.companycar.interfaces.ICompanyCarDAO;
import tam.rentalcars.model.CompanyCar;
import tam.rentalcars.repository.mongo.CompanyCarRepositoryMongo;

import java.util.List;

@Component
@Qualifier("mongodb")
public class CompanyCarDAOImpl implements ICompanyCarDAO {

    private final CompanyCarRepositoryMongo repository;

    public CompanyCarDAOImpl(CompanyCarRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public CompanyCar create(CompanyCar companyCar) {
        return repository.save(companyCar);
    }

    @Override
    public CompanyCar get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public CompanyCar update(CompanyCar companyCar) {
        return repository.save(companyCar);
    }

    @Override
    public CompanyCar delete(String id) {
        CompanyCar companyCar = this.get(id);
        repository.delete(companyCar);
        return companyCar;
    }

    @Override
    public List<CompanyCar> getAll() {
        return repository.findAll();
    }
}
