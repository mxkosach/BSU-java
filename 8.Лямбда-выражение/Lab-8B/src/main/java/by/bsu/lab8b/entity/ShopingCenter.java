package by.bsu.lab8b.entity;


public class ShopingCenter extends HomeBase {
    private double centerAreaSize;

    public ShopingCenter(int id, String address, int countRoom, double area, double cost, int typeId, int isRentHouse, int repairInRoom, double centerAreaSize) {
        super(id, address, countRoom, area, cost, typeId, isRentHouse, repairInRoom);
        this.centerAreaSize = centerAreaSize;
    }

    public double getCenterAreaSize() {
        return centerAreaSize;
    }

    public void setCenterAreaSize(double centerAreaSize) {
        this.centerAreaSize = centerAreaSize;
    }

    @Override
    public String toString() {
        return "ShopingCenter{" +
                "centerAreaSize=" + centerAreaSize +
                "} " + super.toString();
    }
}