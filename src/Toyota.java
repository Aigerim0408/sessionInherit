public class Toyota extends Car {
    private String petrol;

    public Toyota(String marca, String model, String colour, int productionDate, int volume, String petrol) {
        super(marca, model, colour, productionDate, volume);
        this.petrol = petrol;
    }public Toyota(){

    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    @Override
    public void traficLight() {
        super.traficLight();
    }

    @Override
    public String toString() {
        return "petrol:" + petrol + "\n" +
                super.toString();
    }
}
