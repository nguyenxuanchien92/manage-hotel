package models;


public class Hotel {
    // number of days of accommodation
    private int day;
    private TypeRoom typeRoom;
    private Customer customer;
    private long price;

    public Hotel(int day, Customer customer, TypeRoom typeRoom, long price) {
        this.day = day;
        this.customer = customer;
        this.typeRoom = typeRoom;
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "day=" + day +
                ", typeRoom=" + typeRoom +
                ", customer=" + customer +
                ", price=" + price +
                '}';
    }
}
// đây là 1 comment ẩn khác
