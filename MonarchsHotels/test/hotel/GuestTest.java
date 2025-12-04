package hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuestTest {
    Admin fathia;
    Hotel hotel;
    Guest guest;
    ArrayList<Room> rooms;
    @BeforeEach
    public void setUp(){
        rooms = new ArrayList<>();
        guest = new Guest("Oyinade", "54678", "ertyul");
        fathia = new Admin("Fathia", "07048254250", "fathiaoyinloye21@gmail.com", "2299");
        hotel = new Hotel();

    }


        @Test
    public void testThatGuestCanViewAvailableRoom(){
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        rooms =  guest.viewAvailableRooms(hotel);
        assertEquals(RoomStatus.AVAILABLE, rooms.get(0).getStatus());


    }
    public void testThatGuestCanBookARoom(){
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        rooms =  guest.viewAvailableRooms(hotel);


    }

}
