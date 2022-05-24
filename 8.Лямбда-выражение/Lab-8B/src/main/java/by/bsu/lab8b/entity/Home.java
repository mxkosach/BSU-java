package by.bsu.lab8b.entity;

public interface Home {
    double calcM2();

    double getArea();

    String getAddress();

    int getCountRoom();

    void setArea(double area);

    void setIsRentHouse(int isRentHouse);

    void setRepairInRoom(int repairInRoom);
}