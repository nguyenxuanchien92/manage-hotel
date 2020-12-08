package models;

public class Room {
    public static final int RANGEROOM = 20;
    private String idRoom;
    private long priceRoom;
    private TypeRoom typeRoom;
    private String dayOfAccommodation;
    private boolean isRent;

    public Room(long priceRoom, TypeRoom typeRoom, String dayOfAccommodation, boolean isRent) {
        this.priceRoom = priceRoom;
        this.typeRoom = typeRoom;
        this.dayOfAccommodation = dayOfAccommodation;
        this.isRent = isRent;
        this.idRoom = randomIdRoom();
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
