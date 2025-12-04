package hotel;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Guest> guests = new ArrayList<>();
    ;
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Booking> bokings = new ArrayList<>();
    private ArrayList<Room> availableRooms = new ArrayList<>();

    private int count = 1;

    public void addRoom(RoomType type) {
        Room room = new Room(type);
        room.setRoomNumber("" + count++);
        room.setPrice(type);
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }


    public int getNumberOfRooms() {
        return rooms.size();
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }


    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(int index) {
        guests.remove(index);
    }

    public ArrayList<Room> roomUnderMaintenance() {
        ArrayList<Room> roomUnderMaintenance = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getStatus() == RoomStatus.ONMAINTAINANCE) ;
            roomUnderMaintenance.add(room);
        }
        return roomUnderMaintenance;
    }

    public void setAvailableRooms(Hotel hotel) {
        ArrayList<Room> rooms = hotel.getRooms();
        for (Room room : rooms) {
            if (room.getStatus() == RoomStatus.AVAILABLE) availableRooms.add(room);
        }

    }

    public ArrayList<Room> getAvailableRooms() {
        return availableRooms;
    }
}

