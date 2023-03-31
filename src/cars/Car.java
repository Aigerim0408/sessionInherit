package cars;

import java.util.Scanner;

public class Car {
    private String marca;
    private String model;
    private String colour;
    private int productionDate;
    private int volume;

    public Car(String marca, String model, String colour, int productionDate, int volume) {
        this.marca = marca;
        this.model = model;
        this.colour = colour;
        this.productionDate = productionDate;
        this.volume = volume;
    }

    public Car() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void traficLight() {
        Scanner sc = new Scanner(System.in);
        String light = sc.nextLine();
        if (light.equals("Red")) {
            System.out.println("Stop car");
        } else if (light.equals("Yellow")) {
            System.out.println("Be ready to go");
        } else if (light.equals("Green")) {
            System.out.println("Go");
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
                "Model: " + model + "\n" +
                "Colour: " + colour + "\n" +
                "ProductionDate: " + productionDate + "\n" +
                "Volume: " + volume;
    }
}
