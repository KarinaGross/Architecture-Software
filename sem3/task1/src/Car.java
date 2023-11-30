import Enams.TypeCar;
import Enams.TypeFuel;
import Enams.TypeGearBox;

public abstract class Car {
    private String make;
    private String model;
    private java.awt.Color color;
    private TypeCar typeCar;
    private int wheelsNumber;
    private TypeFuel fuel;
    private TypeGearBox gearBox;
    private float engineCap;

    public Car(String make, String model, java.awt.Color color, TypeCar typeCar, int wheelsNumber, TypeFuel fuel,
            TypeGearBox gearBox, float engineCap) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.typeCar = typeCar;
        this.wheelsNumber = wheelsNumber;
        this.fuel = fuel;
        this.gearBox = gearBox;
        this.engineCap = engineCap;
    }

    public void movement() {

    }

    public void maintenance() {

    }

    public boolean trnLights() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TypeCar getBodyType() {
        return typeCar;
    }

    public void setBodyType(TypeCar bodyType) {
        this.typeCar = bodyType;
    }

    public int getNumberWheels() {
        return wheelsNumber;
    }

    public void setNumberWheels(int numberWheels) {
        this.wheelsNumber = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuel;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuel = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBox;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBox = gearBoxType;
    }

    public java.awt.Color getBodyColor() {
        return color;
    }

    public void setBodyColor(java.awt.Color bodyColor) {
        this.color = bodyColor;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(float engineCap) {
        this.engineCap = engineCap;
    }

    public boolean trnWrps() {
        return true;
    }
}