package models;

public class Hotel {


    private Room room;

    public Hotel(Room room) {

        this.room = room;
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Hotel{" +

                ", room=" + room +
                '}';
    }
}
