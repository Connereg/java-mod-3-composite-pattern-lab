public class Main {
    public static void main(String[] args) {
        // your code here
        Logger.getInstance().log("Managing Hotel...");

        // GENERATE HOTEL ROOMS
        HotelRoom room1 = new HotelRoom();
        HotelRoom room2 = new HotelRoom();
        HotelRoom room3 = new HotelRoom();
        HotelRoom room4 = new HotelRoom();
        HotelRoom room5 = new HotelRoom();
        HotelRoom room6 = new HotelRoom();
        HotelRoom room7 = new HotelRoom();
        HotelRoom room8 = new HotelRoom();
        HotelRoom room9 = new HotelRoom();

        // GENERATE HOTEL FLOORS
        HotelFloor floor1 = new HotelFloor();
        HotelFloor floor2 = new HotelFloor();
        HotelFloor floor3 = new HotelFloor();

        //ADD ROOMS TO FLOORS
        floor1.addHotelRoom(room1);
        floor1.addHotelRoom(room2);
        floor1.addHotelRoom(room3);

        floor2.addHotelRoom(room4);
        floor2.addHotelRoom(room5);
        floor2.addHotelRoom(room6);

        floor3.addHotelRoom(room7);
        floor3.addHotelRoom(room8);
        floor3.addHotelRoom(room9);


        //TAKING ACTIONS ON INDIVIDUAL ROOMS
        room1.book("Robby Riggle");
        room1.clean();

        room2.book("Billy Borb");
        room2.clean();

        // TAKING ACTIONS ON ENTIRE FLOORS
        floor2.book("The Adams Family");
        floor2.clean();

        // FLOOR 3 RoomIS UNABLE TO BE USED AS IT IS UNDER CONSTRUCTION
        // WE WILL REMOVE ITS ROOMS TO ACCOMODATE FOR THIS
        floor3.removeHotelRoom(room7);
        floor3.removeHotelRoom(room8);
        floor3.removeHotelRoom(room9);

    }
}
