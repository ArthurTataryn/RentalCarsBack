package tam.rentalcars.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("mongodb")
public class MongoApplicationUserDAOService implements IApplicationUserDAO {

    private final PasswordEncoder passwordEncoder;
    private final ApplicationUserRepository repository;

    @Autowired
    public MongoApplicationUserDAOService(PasswordEncoder passwordEncoder, ApplicationUserRepository repository) {
        this.passwordEncoder = passwordEncoder;
        this.repository = repository;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUserName(String username) {
        return this.repository.findAll().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    @Override
    public List<ApplicationUser> getAll() {
        return this.repository.findAll();
    }

    @Override
    public ApplicationUser create(ApplicationUser user) {
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        return this.repository.save(user);
    }

    @Override
    public ApplicationUser update(ApplicationUser user) {
        return this.repository.save(user);
    }

    @Override
    public ApplicationUser get(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public ApplicationUser delete(String id) {
        ApplicationUser user = this.get(id);
        this.repository.delete(user);
        return user;
    }
}
