package models;

import java.util.Date;

public class Customer {
    private String name;
    private Date dob;
    private long userId;

    public Customer(String name, Date dob, long userId) {
        this.name = name;
        this.dob = dob;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", userId=" + userId +
                '}';
    }
}
