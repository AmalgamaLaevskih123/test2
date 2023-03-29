package lab2_2;
public abstract class Car {
    private String marka;
    private String klass;
    private String weight;
    private Engine engine;

    public Car(String marka, String klass, String weight, Engine engine) {
        this.marka = marka;
        this.klass = klass;
        this.weight = weight;
        this.engine = engine;
    }
    abstract void start();
    abstract void stop();
    abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getMarka() {
        return marka;
    }

    public String getKlass() {
        return klass;
    }

    public String getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }
}