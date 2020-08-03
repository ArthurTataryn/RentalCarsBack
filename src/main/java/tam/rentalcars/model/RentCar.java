package tam.rentalcars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document
public class RentCar {
    @Id
    private String id;
    private CompanyCar companyCar;
    private Customer customer;
    private LocalDate dateOfIssue;
    private LocalDate returnDate;

    public RentCar() { }

    public RentCar(CompanyCar companyCar, Customer customer, LocalDate dateOfIssue, LocalDate returnDate) {
        this.companyCar = companyCar;
        this.customer = customer;
        this.dateOfIssue = dateOfIssue;
        this.returnDate = returnDate;
    }

    public RentCar(String id, CompanyCar companyCar, Customer customer, LocalDate dateOfIssue, LocalDate returnDate) {
        this.id = id;
        this.companyCar = companyCar;
        this.customer = customer;
        this.dateOfIssue = dateOfIssue;
        this.returnDate = returnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CompanyCar getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(CompanyCar companyCar) {
        this.companyCar = companyCar;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentCar rentCar = (RentCar) o;
        return id.equals(rentCar.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RentCar{" +
                "id='" + id + '\'' +
                ", companyCar=" + companyCar +
                ", customer=" + customer +
                ", dateOfIssue=" + dateOfIssue +
                ", returnDate=" + returnDate +
                '}';
    }
}
