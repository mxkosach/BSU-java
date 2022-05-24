package by.bsu.lab8b.main;

import by.bsu.lab8b.entity.*;

import java.util.Arrays;
import java.util.List;

/*
* 10.	Дом. Возможности: построить дом;
* рассчитать цену за квадратный метр;
* узнать сколько комнат;
* увеличить площадь;
 * сдавать дом в аренду;
 * сделать ремонт (в какой-либо комнате).
  * Добавить специализированные методы для Дома, Офисного здания, Торгового центра.
* */
public class Main {
    public static void main(String[] args) {
        Home home = new HomeExt(1, "Минск, Независимости,6", 50, 1000.2, 100000.52, 1, 0, 0, 100);
        Home office = new Office(2, "Минск, Независимости,8", 90, 1500.2, 100000.52, 1, 0, 0, 11.2);
        Home shop = new ShopingCenter(3, "Минск, Независимости,10", 30, 800.2, 100000.52, 1, 0, 0, 15.3);

        List<Home> homes = Arrays.asList(home, office, shop);
        for (Home f : homes) {
            System.out.println(f.toString());
        }

        for (Home f : homes) {
            System.out.println("Адрес: " + f.getAddress() + " стоимость м2 : " + f.calcM2());
        }
        for (Home f : homes) {
            System.out.println("Адрес: " + f.getAddress() + " количество комнат : " + f.getCountRoom());
        }
        for (Home f : homes) {

            System.out.println("Адрес: " + f.getAddress() + " количество комнат : " + f.getCountRoom());
        }
        for (Home f : homes) {
            f.setArea(f.getArea() + 15);
            f.setIsRentHouse(1);
            f.setRepairInRoom(1);
        }
        for (Home f : homes) {
            System.out.println(f.toString());
        }
    }
}