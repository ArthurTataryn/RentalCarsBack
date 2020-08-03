package tam.rentalcars.service.companycar.impls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tam.rentalcars.dao.companycar.interfaces.ICompanyCarDAO;
import tam.rentalcars.model.CompanyCar;
import tam.rentalcars.service.companycar.interfaces.ICompanyCarService;

import java.util.List;

@Service
public class CompanyCarServiceImpl implements ICompanyCarService {

    private final ICompanyCarDAO interfaceDAO;

    public CompanyCarServiceImpl(@Qualifier("mongodb") ICompanyCarDAO iCompanyCarDAO) {
        this.interfaceDAO = iCompanyCarDAO;
    }

    @Override
    public CompanyCar create(CompanyCar companyCar) {
        return interfaceDAO.create(companyCar);
    }

    @Override
    public CompanyCar get(String id) {
        return interfaceDAO.get(id);
    }

    @Override
    public CompanyCar update(CompanyCar companyCar) {
        return interfaceDAO.update(companyCar);
    }

    @Override
    public CompanyCar delete(String id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public List<CompanyCar> getAll() {
        System.out.println("service company");
        return interfaceDAO.getAll();
    }
}
