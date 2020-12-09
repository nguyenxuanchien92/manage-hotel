package models;

import java.util.Date;

public class Customer {
    private String name;
    private String dob;
    private long userId;

    public Customer(String name, String dob, long userId) {
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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
// đây cũng là 1 comment ẩn
