package cars;

import cars.Car;

public class Mercedes extends Car {
    private String steeringWheel;

    public Mercedes(String marca, String model, String colour, int productionDate, int volume, String steeringWheel) {
        super(marca, model, colour, productionDate, volume);
        this.steeringWheel = steeringWheel;
    }public Mercedes(){

    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Steering Wheel:" + steeringWheel + "\n" +
                super.toString();
    }
}
