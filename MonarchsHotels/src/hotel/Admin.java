package hotel;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private String password;

    public Admin(String name, String phoneNumber, String email, String password) {
        super(name, phoneNumber, email);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String changePassword(String phoneNumber, String password) {
        if (phoneNumber.equals(getPhoneNumber())) {
            this.password = password;
            return "Password changed successfully";
        }
       return "Invalid phone number";
    }
    public void makRoomUnderMaintenance(String roomNumber, ArrayList<Room> rooms) {
        Room newRoom = checkRoom(roomNumber, rooms);
        if(newRoom == null) throw new IllegalArgumentException("Room number not found");
        else if (newRoom.getStatus() == RoomStatus.OCCUPIED) throw new IllegalArgumentException("Room already occupied");
        else  newRoom.setStatus(RoomStatus.ONMAINTAINANCE);

    }
    public void makRoomOverMaintenance(String roomNumber, ArrayList<Room> rooms) {
        Room room = checkRoom(roomNumber, rooms);
        if (room.getRoomNumber().equals(roomNumber) && room.getStatus() == RoomStatus.ONMAINTAINANCE) room.setStatus(RoomStatus.AVAILABLE);
        else throw new IllegalArgumentException("Room not on Maintenance");


    }
    public void addRoom(RoomType type, Hotel hotel) {
        hotel.addRoom(type);

    }
    private Room checkRoom(String roomNumber, ArrayList<Room> rooms) {
        Room newRoom = null;
        for (Room room : rooms) {if (room.getRoomNumber().equals(roomNumber)) newRoom = room;}
        return newRoom;
    }


    public void generateReceipt(){

    }
    public ArrayList<Room> viewAllRooms(Hotel hotel){

        return hotel.getRooms();
    }

    public ArrayList<Guest> viewGuestDetails(Hotel hotel){
        return hotel.getGuests() ;
    }
   public void manageReservation(){

   }
   public void sendGuestNotification(){

   }

   public String login(String password){
        if((this.password.equals(password))) return "1";
        else return "2";
   }
   public void isFestive(boolean festive, Hotel hotel){
        if(festive){
            for(Room room : hotel.getRooms()){
                room.setFestive();
            }

        }

   }






}
