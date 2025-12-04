package hotel;

public class Room {
    private String roomNumber;
    private RoomType type;
    private RoomStatus status = RoomStatus.AVAILABLE;
    private double price;
    private boolean isFestive;




    public Room(RoomType type) {
        this.type = type;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
    public RoomType getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }

    public RoomStatus getStatus() {
        return status;
    }
    public void setPrice(RoomType type) {
        double price = type.getPrice();
        if(isFestive) price *= 0.5;
        this.price = price;

    }
    public void setStatus(RoomStatus status) {
        this.status = status;
    }
    public void setFestive() {
        isFestive = true;
    }
}
