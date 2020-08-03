package tam.rentalcars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Fuel {
    @Id
    private String id;
    private String name;
    //petrol, diesel, electric, mixed

    public Fuel() { }

    public Fuel(String name) {
        this.name = name;
    }

    public Fuel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fuel fuel = (Fuel) o;
        return Objects.equals(id, fuel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
