package tam.rentalcars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class CompanyCar {
    @Id
    private String id;
    private Car car;
    private int costCar;
    private String licenseNumberPlates;
    private int rentalPrice;
    private boolean repair;
    private boolean rent;

    public CompanyCar() { }

    public CompanyCar(Car car, int costCar, String licenseNumberPlates, int rentalPrice) {
        this.car = car;
        this.costCar = costCar;
        this.licenseNumberPlates = licenseNumberPlates;
        this.rentalPrice = rentalPrice;
    }

    public CompanyCar(String id, Car car, int costCar, String licenseNumberPlates, int rentalPrice, boolean repair, boolean rent) {
        this.id = id;
        this.car = car;
        this.costCar = costCar;
        this.licenseNumberPlates = licenseNumberPlates;
        this.rentalPrice = rentalPrice;
        this.repair = repair;
        this.rent = rent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getCostCar() {
        return costCar;
    }

    public void setCostCar(int costCar) {
        this.costCar = costCar;
    }

    public String getLicenseNumberPlates() {
        return licenseNumberPlates;
    }

    public void setLicenseNumberPlates(String licenseNumberPlates) {
        this.licenseNumberPlates = licenseNumberPlates;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyCar that = (CompanyCar) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CompanyCar{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", costCar=" + costCar +
                ", licenseNumberPlates='" + licenseNumberPlates + '\'' +
                ", rentalPrice=" + rentalPrice +
                ", repair=" + repair +
                ", rent=" + rent +
                '}';
    }
}
