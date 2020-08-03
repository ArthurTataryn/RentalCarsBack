package tam.rentalcars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import tam.rentalcars.auth.ApplicationUser;

import java.util.List;
import java.util.Objects;

@Document
public class Customer {
    @Id
    private String id;
    private Person person;
    private int bonusPoints;
    private List<ReturnRentCar> carList;
    private RentCar rent;
    private ApplicationUser applicationUser;

    public Customer() { }

    public Customer(Person person, ApplicationUser applicationUser) {
        this.person = person;
        this.applicationUser = applicationUser;
    }

    public Customer(String id, Person person, int bonusPoints, List<ReturnRentCar> carList, RentCar rent, ApplicationUser applicationUser) {
        this.id = id;
        this.person = person;
        this.bonusPoints = bonusPoints;
        this.carList = carList;
        this.rent = rent;
        this.applicationUser = applicationUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public List<ReturnRentCar> getCarList() {
        return carList;
    }

    public void setCarList(List<ReturnRentCar> carList) {
        this.carList = carList;
    }

    public RentCar getRent() {
        return rent;
    }

    public void setRent(RentCar rent) {
        this.rent = rent;
    }

    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }

    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", bonusPoints=" + bonusPoints +
                ", carList=" + carList +
                ", rent=" + rent +
                ", applicationUser=" + applicationUser +
                '}';
    }
}
