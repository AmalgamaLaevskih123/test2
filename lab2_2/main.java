package lab2_2;

public class main {
    public static void main (String[] arg){
        Engine sportEngine = new Engine(750, "Тойота");
        Engine standardEngine = new Engine(200, "Автодизель");

        Car lorry = new Lorry("Урал", "C", "9750", standardEngine, 400);
        Car sport = new SportCar("Бугатти", "А", "2000", sportEngine, 407);

        lorry.turnLeft();
        lorry.turnRight();
        lorry.start();
        lorry.stop();
        lorry.printInfo();

        System.out.println();

        sport.start();
        sport.stop();
        sport.printInfo();
    }
}