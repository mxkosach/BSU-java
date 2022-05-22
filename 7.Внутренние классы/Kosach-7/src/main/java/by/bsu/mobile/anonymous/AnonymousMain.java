package by.bsu.mobile.anonymous;


import by.bsu.mobile.entity.MobileProperties;

public class AnonymousMain {
    public static void main(String[] args) {
        MobileProperties mobileProperties = new MobileProperties("Samsung S22", 5000, 6.5);

        MobileProperties mobilePropertiesAnonymous = new MobileProperties("Samsung S22", 5000, 6.5) {
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("MobileProperties{");
                sb.append("Модель='").append(getModel()).append('\'');
                sb.append(", Ёмкость аккумулятора=").append(getAccumCapacity());
                sb.append(", размер экрана=").append(getScreenSize());
                sb.append('}');
                return sb.toString();
            }

        };
        System.out.println("Метод toString() обычный класс");
        System.out.println(mobileProperties.toString());
        System.out.println("Метод toString() анонимный класс");
        System.out.println(mobilePropertiesAnonymous.toString());
    }
}