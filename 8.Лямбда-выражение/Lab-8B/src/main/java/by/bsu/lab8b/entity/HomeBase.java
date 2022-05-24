package by.bsu.lab8b.entity;

public class HomeBase extends HomeAbs {
    private int id;
    private String address;
    private int countRoom;
    private double area;
    private double cost;
    private int typeId;
    private int isRentHouse;
    private int repairInRoom;

    public HomeBase() {
    }

    public HomeBase(int id, String address, int countRoom, double area, double cost, int typeId, int isRentHouse, int repairInRoom) {
        this.id = id;
        this.address = address;
        this.countRoom = countRoom;
        this.area = area;
        this.cost = cost;
        this.typeId = typeId;
        this.isRentHouse = isRentHouse;
        this.repairInRoom = repairInRoom;
    }

    @Override
    public double calcM2() {
        return cost / area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }
    @Override
    public double getArea() {
        return area;
    }
    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getIsRentHouse() {
        return isRentHouse;
    }
    @Override
    public void setIsRentHouse(int isRentHouse) {
        this.isRentHouse = isRentHouse;
    }

    public int getRepairInRoom() {
        return repairInRoom;
    }
    @Override
    public void setRepairInRoom(int repairInRoom) {
        this.repairInRoom = repairInRoom;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", countRoom=" + countRoom +
                ", area=" + area +
                ", cost=" + cost +
                ", typeId=" + typeId +
                ", isRentHouse=" + isRentHouse +
                ", repairInRoom=" + repairInRoom +
                '}';
    }
}