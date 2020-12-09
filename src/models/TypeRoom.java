package models;

public enum TypeRoom {
    VIP(20000), ECONOMY(5000);

    public final long value;

    TypeRoom(long value) {
        this.value = value;
    }
}
