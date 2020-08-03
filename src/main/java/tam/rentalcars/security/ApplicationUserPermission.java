package tam.rentalcars.security;

public enum ApplicationUserPermission {

    CUSTOMER_READ("customer:read"),
    CUSTOMER_WRITE("customer:write"),
    MODER_READ("moder:read"),
    MODER_WRITE("moder:write"),
    ADMIN_READ("admin:read"),
    ADMIN_WRITE("admin:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
