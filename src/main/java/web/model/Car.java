package web.model;

public class Car {
    private String model;
    private int number;
    private int vin;

    public Car(String model, int number, int vin) {
        this.model = model;
        this.number = number;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
