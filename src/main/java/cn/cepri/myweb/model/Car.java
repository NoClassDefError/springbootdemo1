package cn.cepri.myweb.model;


public class Car {
    private long value;
    private String name;

    public Car(long value, String name) {
        this.value = value;
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
