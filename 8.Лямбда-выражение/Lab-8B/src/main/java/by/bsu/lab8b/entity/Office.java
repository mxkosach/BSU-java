package by.bsu.lab8b.entity;

public class Office extends HomeBase {
    private double officeAreaSize;

    public Office(int id, String address, int countRoom, double area, double cost, int typeId, int isRentHouse, int repairInRoom, double officeAreaSize) {
        super(id, address, countRoom, area, cost, typeId, isRentHouse, repairInRoom);
        this.officeAreaSize = officeAreaSize;
    }

    

    public double getOfficeAreaSize() {
        return officeAreaSize;
    }

    public void setOfficeAreaSize(double officeAreaSize) {
        this.officeAreaSize = officeAreaSize;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeAreaSize=" + officeAreaSize +
                "} " + super.toString();
    }
}