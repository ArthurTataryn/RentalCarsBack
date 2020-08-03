package tam.rentalcars.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserService implements UserDetailsService {

    private final IApplicationUserDAO iApplicationUserDAO;

    @Autowired
    public ApplicationUserService(@Qualifier("mongodb") IApplicationUserDAO iApplicationUserDAO) {
        this.iApplicationUserDAO = iApplicationUserDAO;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return iApplicationUserDAO.selectApplicationUserByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(" User  %s  not found", username)));
    }
}
