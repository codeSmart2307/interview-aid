package solid_principles;

class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
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

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int horsePower, int batteryCapacity) {
        super(brand, model, horsePower);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

public class OpenClosed {

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 650, 25000);
        System.out.println(tesla.getHorsePower() + " HP");
        System.out.println(tesla.getBatteryCapacity() + " mAh");
    }
}
