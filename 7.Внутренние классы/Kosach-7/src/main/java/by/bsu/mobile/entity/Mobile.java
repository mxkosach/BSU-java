package by.bsu.mobile.entity;
/*
Создать класс Mobile с внутренним классом,
с помощью объектов которого можно хранить информацию о моделях телефонов и их свойствах.
* */
public class Mobile {
    private String brand;
    private String model;
    private MobileProperties mobileProperties;

    public Mobile() {
    }

    public Mobile(String brand, String model, MobileProperties mobileProperties) {
        this.brand = brand;
        this.model = model;
        this.mobileProperties = mobileProperties;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MobileProperties getMobileProperties() {
        return mobileProperties;
    }

    public void setMobileProperties(MobileProperties mobileProperties) {
        this.mobileProperties = mobileProperties;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mobile{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", mobileProperties=").append(mobileProperties);
        sb.append('}');
        return sb.toString();
    }
}
