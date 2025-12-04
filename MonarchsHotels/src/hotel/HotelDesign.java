package hotel;

public class HotelDesign {

    public static void registerAdmin(){

       String adminRegistry = """
                
                *******************************************************
                *   WElCOME TO OMOTEMMY HOTEL APPLICATION             *
                *******************************************************
                ================Register As An Admin==================*
                ********************************************************
                
                """;
       System.out.println(adminRegistry);
    }
    public static void roomType(){

        String rooms = """
                
                *******************************************************
                *                  CHOOSE ROOM TYPE                   *
                *******************************************************
                *       1         ->          SINGLE                  *
                *       2         ->          DOUBLE                  *
                *       3         ->          SUITE                   *
                ********************************************************


                
                """;
        System.out.println(rooms);
    }

    public static void userOption(){

        String user = """
                
                *******************************************************
                *              ENTER AS ADMIN OR GUEST                *
                *******************************************************
                *       1         ->          ADMIN                  *
                *       2         ->          GUEST                  *
                ********************************************************


                
                """;
        System.out.println(user);
    }

    public static void customersMenu(){

        String rooms = """
                
                ******************************************************
                *                WELCOME ESTEEMED CUSTOMER           *
                ******************************************************
                *       1         ->          Book Room              *
                *       2         ->          View Booking           *
                *       3         ->          Edit Profile           *
                *       4        ->           Book Room              *
                *       5         ->          View Booking           *
                *       6         ->          Edit Profile           *
                *       7        ->           View Booking           *
                *       8         ->          Edit Profile           *
                ******************************************************


                
                """;
        System.out.println(rooms);
    }

    public static void adminMenu(){

        String menu = """
                
                ******************************************************
                *                WELCOME ADMIN                       *
                ******************************************************
                =======================  OPTIONS ====================*
                *       1       ->      View All Rooms               *
                *       2       ->      Manage Reservations          *
                *       3       ->      Generate Report              *
                *       4       ->      Mark Room for Maintenance    *
                *       5       ->      View Booking                 *
                *       6       ->      Edit Profile                 *
                *       7       ->      View Booking                 *
                *       8       ->      Edit Profile                 *
                ******************************************************

                """;
        System.out.println(menu);
    }




}
