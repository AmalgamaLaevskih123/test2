package lab2_2;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String marka, String klass, String weight, Engine engine, int maxSpeed) {
        super(marka, klass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("Спортивная машина поехала");
    }

    @Override
    void stop() {
        System.out.println("Спортивная машина остановилась");
    }

    @Override
    void printInfo() {
        System.out.println(
                "Марка " + this.getMarka() + "\n" +
                        "Класс: " + this.getKlass() + "\n" +
                        "Вес: " + this.getWeight() + "\n" +
                        "Грузоподъемность: " + this.maxSpeed + "\n" +
                        "Мотор: " + "\n\t |Мощность: " + this.getEngine().getPower()
                        + "\n\t |Производитель: " + this.getEngine().getEfficiency()
        );
    }
}