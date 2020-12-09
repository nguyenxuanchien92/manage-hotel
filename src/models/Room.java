package models;

public class Room {
    public static final int RANGEROOM = 20;
    private String idRoom;
    private long priceRoom;
    private TypeRoom typeRoom;
    private String dayOfAccommodation;
    private boolean isRent;
    private Customer customer;
    private static int count = 0;

    public Room(long priceRoom, TypeRoom typeRoom, String dayOfAccommodation) {
        this.priceRoom = priceRoom;
        this.typeRoom = typeRoom;
        this.dayOfAccommodation = dayOfAccommodation;
        this.isRent = true;
        this.idRoom = randomIdRoom();
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

//    public void setRent(boolean rent) {
//        isRent = rent;
//    }

    private String randomIdRoom() {
        count++;
        if (count <= RANGEROOM) {
            return count + "";
        }
        return - 1 + "";
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
