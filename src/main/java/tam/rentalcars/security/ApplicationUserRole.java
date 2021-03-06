package tam.rentalcars.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static tam.rentalcars.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {

    SUPERADMIN(Sets.newHashSet(CUSTOMER_READ, CUSTOMER_WRITE, MODER_READ, MODER_WRITE, ADMIN_READ, ADMIN_WRITE)),
    ADMIN(Sets.newHashSet(CUSTOMER_READ, CUSTOMER_WRITE, MODER_READ, MODER_WRITE, ADMIN_READ)),
    MODER(Sets.newHashSet(CUSTOMER_READ, CUSTOMER_WRITE, MODER_READ)),
    CUSTOMER(Sets.newHashSet(CUSTOMER_READ)),
    USER(Sets.newHashSet());

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        final Set<SimpleGrantedAuthority> permissions = this.getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));

        return permissions;

    }
}
