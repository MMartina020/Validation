package hu.Validation.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dateofbuild")
    private Date dateOfBuild;
    private String address;
    private boolean rentable;
    private double price;

    public Building() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfBuild() {
        return dateOfBuild;
    }

    public void setDateOfBuild(Date dateOfBuild) {
        this.dateOfBuild = dateOfBuild;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", dateOfBuild=" + dateOfBuild +
                ", address='" + address + '\'' +
                ", rentable=" + rentable +
                ", price=" + price +
                '}';
    }
}
