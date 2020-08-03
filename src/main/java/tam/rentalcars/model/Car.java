package tam.rentalcars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Car {
    @Id
    private String id;
    private String brandCar;
    private String modelCar;
    private TypeCar typeCar;
    private int carMileage;
    private boolean transmission;
    private String yearCar;
    private int door;
    private Fuel fuel;
    private Color color;

    public Car() { }

    public Car(String brandCar, String modelCar, TypeCar typeCar, int carMileage, boolean transmission, String yearCar, int door, Fuel fuel, Color color) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.typeCar = typeCar;
        this.carMileage = carMileage;
        this.transmission = transmission;
        this.yearCar = yearCar;
        this.door = door;
        this.fuel = fuel;
        this.color = color;
    }

    public Car(String id, String brandCar, String modelCar, TypeCar typeCar, int carMileage, boolean transmission, String yearCar, int door, Fuel fuel, Color color) {
        this.id = id;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.typeCar = typeCar;
        this.carMileage = carMileage;
        this.transmission = transmission;
        this.yearCar = yearCar;
        this.door = door;
        this.fuel = fuel;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }

    public boolean isTransmission() {
        return transmission;
    }

    public void setTransmission(boolean transmission) {
        this.transmission = transmission;
    }

    public String getYearCar() {
        return yearCar;
    }

    public void setYearCar(String yearCar) {
        this.yearCar = yearCar;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id.equals(car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brandCar='" + brandCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", typeCar=" + typeCar +
                ", carMileage=" + carMileage +
                ", transmission=" + transmission +
                ", yearCar='" + yearCar + '\'' +
                ", door=" + door +
                ", fuel=" + fuel +
                ", color='" + color + '\'' +
                '}';
    }
}
