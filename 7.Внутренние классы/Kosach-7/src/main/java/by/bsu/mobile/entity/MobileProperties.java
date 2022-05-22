package by.bsu.mobile.entity;

public class MobileProperties {
    private String model;
    private Long accumCapacity;
    private Double screenSize;

    public MobileProperties() {
    }

    public MobileProperties(String model, Long accumCapacity, Double screenSize) {
        this.model = model;
        this.accumCapacity = accumCapacity;
        this.screenSize = screenSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getAccumCapacity() {
        return accumCapacity;
    }

    public void setAccumCapacity(Long accumCapacity) {
        this.accumCapacity = accumCapacity;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MobileProperties{");
        sb.append("model='").append(model).append('\'');
        sb.append(", accumCapacity=").append(accumCapacity);
        sb.append(", screenSize=").append(screenSize);
        sb.append('}');
        return sb.toString();
    }
}
