package models;

import java.util.Date;

public class Customer {
    private String name;
    private String dob;
    private String userId;

    public Customer(String name, String dob, String userId) {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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
