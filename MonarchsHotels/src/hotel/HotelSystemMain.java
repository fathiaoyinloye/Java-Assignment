package hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class HotelSystemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        HotelDesign.registerAdmin();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Set Your Password: ");
        String password = scanner.nextLine();
        Admin admin = new Admin(name, phoneNumber, email, phoneNumber);
        System.out.print("Choose the number of rooms that are in your hotel: ");
        int numberOfRooms = scanner.nextInt();
        HotelDesign.roomType();
        for (int count = 1; count <= numberOfRooms; count++) {
            System.out.print("Choose the room type from the option above: ");
            String roomType = scanner.nextLine();
            switch (roomType) {
                case "1" -> admin.addRoom(RoomType.SINGLE, hotel);
                case "2" -> admin.addRoom(RoomType.DOUBLE, hotel);
                case "3" -> admin.addRoom(RoomType.DOUBLE, hotel);
                default -> {
                    System.out.println("Invalid choice");
                    count--;
                }
            }


        }
        HotelDesign.userOption();
        System.out.print("Enter as Admin or Guest: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> {
                System.out.print("Enter Admin Password: ");
                String adminPassword = scanner.nextLine();
                String check = admin.login(adminPassword);
                switch (choice) {
                    case "1" -> {
                        HotelDesign.adminMenu();
                       System.out.print("Enter your choice from above menu: ");
                                String adminChoice = scanner.nextLine();
                                switch(adminChoice) {
                                    case "1" ->{
                                        ArrayList<Room> roomsToView = admin.viewAllRooms(hotel);
                                        for (Room room : roomsToView) {
                                            System.out.print("Room Number : " + room.getRoomNumber() + "      ");
                                            System.out.print("Type:  " + room.getType() + "    ");
                                            System.out.print("Price: " +room.getPrice() + "    ");
                                            System.out.println("Status:  " + room.getStatus());

                                        }
                                    }
                                    case "2" -> {System.out.println("Manage Reservations");}
                                    case "3" -> {System.out.println("Generate Reports");}
                                    case "4" -> {
                                        System.out.println("Enter Room Number: ");
                                        String roomNumber = scanner.nextLine();

                                        admin.makRoomUnderMaintenance(roomNumber, admin.viewAllRooms(hotel));


                                    }
                                    case "5" -> {System.out.println("Add Rooms");}
                                    case "6" -> {System.out.println("View guest Details");}
                                    default -> {System.out.println("Invalid choice");}


                                }


                    }
                    case "2" -> {
                        System.out.println("Invalid Admin Password");
                    }
                }


            }
            case "2" -> {
                HotelDesign.customersMenu();
            }
            default -> {
                System.out.println("Invalid Input");
            }
        }
    }
}

