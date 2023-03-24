public class Lexus extends Car {
    private String engine;

    public Lexus(String marca, String model, String colour, int productionDate, int volume,String engine) {
        super(marca, model, colour, productionDate, volume);
        this.engine = engine;
    }
    public Lexus(){

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "engine: " + engine + "\n" +
                super.toString();
    }
}

