package by.bsu.lab8b.entity;


public class HomeExt extends HomeBase {
    private int countRoom;

    public HomeExt(int id, String address, int countRoom, double area, double cost, int typeId, int isRentHouse, int repairInRoom, int countRoom1) {
        super(id, address, countRoom, area, cost, typeId, isRentHouse, repairInRoom);
        this.countRoom = countRoom1;
    }

    public HomeExt() {
    }

    @Override
    public int getCountRoom() {
        return countRoom;
    }

    @Override
    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }

    @Override
    public String toString() {
        return "HomeExt{" +
                "countRoom=" + countRoom +
                "} " + super.toString();
    }
}