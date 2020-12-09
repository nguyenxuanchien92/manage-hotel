package models;

public class Room {
    public static final int RANGEROOM = 20;
    private String idRoom;
    private long priceRoom;
    private TypeRoom typeRoom;
    private String dayOfAccommodation;
    private boolean isRent;
    private Customer customer;

    public Room(long priceRoom, TypeRoom typeRoom, String dayOfAccommodation, boolean isRent, Customer customer) {
        this.priceRoom = priceRoom;
        this.typeRoom = typeRoom;
        this.dayOfAccommodation = dayOfAccommodation;
        this.isRent = isRent;
        this.idRoom = randomIdRoom();
        this.customer = customer;
    }

    public String getIdRoom() {
        return this.idRoom;
    }

    public long getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(long priceRoom) {
        this.priceRoom = priceRoom;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getDayOfAccommodation() {
        return dayOfAccommodation;
    }

    public void setDayOfAccommodation(String dayOfAccommodation) {
        this.dayOfAccommodation = dayOfAccommodation;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private String randomIdRoom() {
        int val = Integer.parseInt(String.valueOf(Math.floor(Math.random() * RANGEROOM + 1)));
        return String.valueOf(val);
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom='" + idRoom + '\'' +
                ", priceRoom=" + priceRoom +
                ", typeRoom=" + typeRoom +
                ", dayOfAccommodation='" + dayOfAccommodation + '\'' +
                ", isRent=" + isRent +
                '}';
    }
}
