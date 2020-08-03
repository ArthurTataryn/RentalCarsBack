package tam.rentalcars.auth;

import java.util.List;
import java.util.Optional;

public interface IApplicationUserDAO {

    Optional<ApplicationUser> selectApplicationUserByUserName(String username);

    List<ApplicationUser> getAll();
    ApplicationUser create(ApplicationUser user);
    ApplicationUser update(ApplicationUser user);
    ApplicationUser get(String id);
    ApplicationUser delete(String id);
}
