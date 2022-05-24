package by.bsu.lab8.main;

import by.bsu.lab8.entity.Comedy;
import by.bsu.lab8.entity.DomesticFilm;
import by.bsu.lab8.entity.Film;

import java.util.Arrays;
import java.util.List;
/*
* Создать и реализовать интерфейсы, также использовать наследование и по¬лиморфизм для следующих предметных областей:
* 10.	interface Фильм → class Отечественный Фильм → class Комедия.*/
public class Main {
    public static void main(String[] args) {

        Film domesticFilm = new DomesticFilm(1, "Domestic", "good");
        Film comedy = new Comedy(2, "Comedy", 2, "Alen", "good");

        List<Film> films = Arrays.asList(domesticFilm, comedy);
        for (Film f : films) {
            f.see();// полиморфный вызов метода
        }
    }
}