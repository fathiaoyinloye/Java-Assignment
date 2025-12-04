package hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;

public class Booking {{}
    private String bookingReferenceNumber;
    private int count = 1;
    private Room roomBooked ;
    private Guest guestBooked;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Booking(Hotel hotel, Guest guest, Room room) {
        this.roomBooked = room;
        this.guestBooked = guest;
    }

    public void setBookingReferenceNumber(String bookingReferenceNumber) {
        String referenceNumber = "BRN" + count;
        this.bookingReferenceNumber = referenceNumber;
        guestBooked.setBookingReferenceNumber(referenceNumber);


    }


    public boolean validateDate(String dateInputed) {
        try {
            LocalDate.parse(dateInputed, FORMAT);
            return true;
        } catch (DateTimeParseException exception) {
            return false;

        }
    }

        public void getCheckInDate(String dateString){
        LocalDate checkInDate = LocalDate.parse(dateString, FORMAT);
        this.checkInDate = checkInDate;
        guestBooked.setCheckInDate(checkInDate);

        }

        public LocalDate checkOutDate(LocalDate checkInDate,int noOfDays ){
            LocalDate checkOutDate = checkInDate.plusDays(noOfDays);
            this.checkOutDate = checkOutDate;
            guestBooked.setCheckOutDate(checkOutDate);
            return checkOutDate;
    }

    public Room getRoomBooked() {
        return roomBooked;
    }

    public Guest getGuestBooked() {
        return guestBooked;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }


    public String getBookingReferenceNumber() {
        return bookingReferenceNumber;
    }
}









