package tam.rentalcars.service;

import java.util.List;

public interface IGenericService<T> {
    T create(T t);
    T get(String id);
    T update(T t);
    T delete(String id);
    List<T> getAll();
}
