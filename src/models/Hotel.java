package models;


public class Hotel {
    private Customer customer;
    private Room room;

    public Hotel(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "customer=" + customer +
                ", room=" + room +
                '}';
    }
}

