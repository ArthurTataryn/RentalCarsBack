package tam.rentalcars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class TypeCar {
    @Id
    private String id;
    private String name;
    //HATCHBACK, SEDAN, MUV_SUV, COUPE, CONVERTIBLE, WAGON, VAN, PIC_UP_VEHICLE

    public TypeCar() { }

    public TypeCar(String name) {
        this.name = name;
    }

    public TypeCar(String id, String name) {
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
        TypeCar typeCar = (TypeCar) o;
        return Objects.equals(id, typeCar.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TypeCar{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
