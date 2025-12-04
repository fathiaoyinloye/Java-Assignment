package hotel;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import java.util.ArrayList;
public class Guest extends User{
      private String bookingReferenceNumber;
      private int numberOfnight;
      private LocalDate checkInDate;
      private LocalDate checkOutDate;



    public Guest(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email );

    }
    public String getBookingReferenceNumber() {
        return bookingReferenceNumber;
    }

    public void setBookingReferenceNumber(String bookingReferenceNumber) {
        this.bookingReferenceNumber = bookingReferenceNumber;
    }

    public void viewNotification(){

    }
    public void checkPaymentStatus(){


    }
    public void noOfNight(int noOfNiht){
    this.numberOfnight = noOfNiht;
    }
    public int setNoOfNight(){
        return this.numberOfnight;

    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

   public ArrayList<Room> bookARoom(ArrayList){
            for(Room room : rooms)



        }
  /*public void cancelReservation(String bookingReferenceNumber){
            for(Guest myGuest : guest.getGuests()) {
                if(bookingReferenceNumber.equals(myGuest.getBookingReferenceNumber())) {
                    guest.removeGuest(count);
                    rooms.removeRoom(count);
                }count++;
            }

    }*/
    public void  editProfile(String name, String phoneNumber, String email){
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public ArrayList<Room> viewAvailableRooms(Hotel hotel){
      ArrayList<Room> rooms = hotel.getRooms();
        ArrayList<Room> availableRooms = new ArrayList<>();
        for(Room room : rooms){
          if (room.getStatus() == RoomStatus.AVAILABLE) availableRooms.add(room);
      }

      return rooms;
    }




}
