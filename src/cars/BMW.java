package cars;

import cars.Car;

public class BMW extends Car {
    private String speed;

    public BMW(String marca, String model, String colour, int productionDate, int volume, String speed) {
        super(marca, model, colour, productionDate, volume);
        this.speed = speed;

    }

    public BMW() {

    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public void traficLight() {
        super.traficLight();
    }

    @Override
    public String toString() {
        return "speed='" + speed + "\n" +
                super.toString();
    }
}

