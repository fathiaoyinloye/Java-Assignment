package hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {
    Admin fathia;
    Hotel hotel;
    @BeforeEach
    void setUp(){
        fathia = new Admin("Fathia", "07048254250", "fathiaoyinloye21@gmail.com", "2299");
         hotel = new Hotel();
    }
    @Test
    public void testThatAnAdminCanSetTheirDetailsAndChangePassword() {
        String actual = fathia.changePassword("07048254250", "1234");
        assertEquals("Password changed successfully", actual);


    }

    @Test
    public void testThatAdminPasswordCannotBeChangedIfPhoneNumberIsIncorrect() {
        String actual = fathia.changePassword("07054250", "1234");
        assertEquals("Invalid phone number", actual);


    }

    @Test
    public void testThatARoomCanBeAddedBYTheAdmin() {

        fathia.addRoom(RoomType.DOUBLE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());


    }

    @Test
    public void testThatAdmninAddARoom_RoomHasARoomNumber() {

        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        assertNotNull(hotel.getRooms().getFirst().getRoomNumber());
        assertEquals("1", hotel.getRooms().getFirst().getRoomNumber());

    }

    @Test
    public void testAdminCanAddTwoRoomsAdded_RoomHasARoomNumberOneAndTwo() {

        ArrayList<Room> rooms = new ArrayList<>();
        rooms = hotel.getRooms();
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        assertEquals("1", rooms.getFirst().getRoomNumber());
        fathia.addRoom(RoomType.DOUBLE, hotel);
        assertEquals(2, hotel.getNumberOfRooms());
        assertEquals("2", rooms.get(1).getRoomNumber());


    }

    @Test
    public void adminAddedTwoRooms_MakeOneRoomUnderMaintenance() {

        ArrayList<Room> rooms = new ArrayList<>();
        rooms = hotel.getRooms();
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        assertEquals("1", rooms.get(0).getRoomNumber());
        fathia.addRoom(RoomType.DOUBLE, hotel);
        assertEquals(2, hotel.getNumberOfRooms());
        assertEquals("2", rooms.get(1).getRoomNumber());
        fathia.makRoomUnderMaintenance("1", rooms);
        assertEquals(RoomStatus.ONMAINTAINANCE, rooms.get(0).getStatus());
    }

    @Test
    public void adminAddedTwoRooms_tryToChangeTheStatusOfAnUnknownRoomNumber_throwExceptions() {


        ArrayList<Room> rooms = new ArrayList<>();
        rooms = hotel.getRooms();
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        assertEquals("1", rooms.get(0).getRoomNumber());
        fathia.addRoom(RoomType.SINGLE, hotel);
        assertEquals(2, hotel.getNumberOfRooms());
        assertEquals("2", rooms.get(1).getRoomNumber());
        ArrayList<Room> finalRooms = rooms;
        assertThrows(IllegalArgumentException.class, () -> fathia.makRoomUnderMaintenance("3", finalRooms));


    }
    @Test
    public void adminAddedTwoRooms_AdminCanViewTwoRooms(){

        ArrayList<Room> rooms = new ArrayList<>();
        rooms = hotel.getRooms();
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        assertEquals("1", rooms.get(0).getRoomNumber());
        fathia.addRoom(RoomType.SINGLE, hotel);

        assertEquals(2, hotel.getNumberOfRooms());
       ArrayList<Room> roomsToView = fathia.viewAllRooms(hotel);
       for (Room room : roomsToView) {
           System.out.print("Room Number : " + room.getRoomNumber() + "      ");
           System.out.print("Type:  " + room.getType() + "    ");
           System.out.print("Price: " +room.getPrice() + "    ");
           System.out.println("Status:  " + room.getStatus());

       }

    }
    @Test
    public void adminAddedTwoRooms_AdminAddedTheRoomOnMaintenance(){

        ArrayList<Room> rooms = new ArrayList<>();
        rooms = hotel.getRooms();
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        assertEquals("1", rooms.get(0).getRoomNumber());
        fathia.addRoom(RoomType.SINGLE, hotel);
        fathia.makRoomUnderMaintenance("1", rooms);
        assertEquals(RoomStatus.ONMAINTAINANCE, rooms.get(0).getStatus());

    }
    @Test
    public void roomisOccupied_AdminCannotChangeRoomStatusWhileItIsOccupied(){

        ArrayList<Room> rooms = new ArrayList<>();
        rooms = hotel.getRooms();
        fathia.addRoom(RoomType.SUITE, hotel);
        assertEquals(1, hotel.getNumberOfRooms());
        assertEquals("1", rooms.get(0).getRoomNumber());
        fathia.addRoom(RoomType.SINGLE, hotel);
        fathia.viewAllRooms(hotel).get(0).setStatus(RoomStatus.OCCUPIED);
        ArrayList<Room> finalRooms = rooms;
        assertThrows(IllegalArgumentException.class, () -> fathia.makRoomUnderMaintenance("1", finalRooms));

    }
   // @Test
//    public void testThatAdminCanSetPriceToFestivePeriodPrice(){
//        Admin fathia = new Admin("fathia", "08033300853", "fathia@mail", "1234");
//        Hotel hotel = new Hotel();
//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms = hotel.getRooms();
//        fathia.addRoom(RoomType.SUITE, hotel);
//        assertEquals(1, hotel.getNumberOfRooms());
//        assertEquals("1", rooms.get(0).getRoomNumber());
//        fathia.addRoom(RoomType.SINGLE, hotel);
//        assertEquals(30000.0,fathia.viewAllRooms(hotel).get(0).getPrice());
//        fathia.isFestive(true,hotel);
//        assertEquals(45000.0,fathia.viewAllRooms(hotel).get(0).getPrice());
//        assertEquals(45000.0,fathia.viewAllRooms(hotel).get(0).getPrice());
//
//
//
//
//    }





}
