package hotel;

public enum RoomType {
    SINGLE(10000.0),
    DOUBLE(20000.0),
    SUITE(30000.0);
    private double price;

    RoomType(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }


}