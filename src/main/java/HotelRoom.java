
public class HotelRoom implements HotelRoomInterface {
    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }

    public void clean() {
        Logger.getInstance().log("Cleaned Room");
    }

    public void removeForConstruction() { Logger.getInstance().log("Room under construction, cannot be booked"); }

}
