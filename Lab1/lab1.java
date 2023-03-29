package Lab1;
import java.util.Scanner;
import java.util.Arrays;

public class lab1 {
    public static void main(String[] arg) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        System.out.println("Последняя цифра: " + a % 10);
    }

    public static void task2() {
        boolean flag = true;
        while (flag == true) {
            System.out.println("Задание 2");
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите трёхзначное число: ");
            String a = sc.nextLine();
            int sum = 0;
            int alength = a.length();
            if (alength == 3) {
                int b = Integer.parseInt(a);
                while (b > 0) {
                    sum = sum + b % 10;
                    b = b / 10;
                }
                System.out.println("Сумма цифр числа: " + sum);
                flag = false;
            } else {
                System.out.println("Вы ввели не трёхзначное число");
            }
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        if (a>0){
            a+=1;
            System.out.println("Число положительное, прибавим 1: " + a);
        }
        else{
            System.out.println("Число отрицательное: " + a);
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        if (a>0){
            a+=1;
            System.out.println("Число положительное, прибавим 1: " + a);
        }
        else if (a<0){
            a-=2;
            System.out.println("Число отрицательное: " + a);
        }
        else{
            a=10;
            System.out.println("Вы ввели 0: " + a);
        }
    }
    public static void task5(){
        System.out.println("Задание 5");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int minimum = Math.min(Math.min(a, b), c);
        System.out.println("Минимальное число: " + minimum);
    }
    public static void task6(){
        System.out.println("Задание 6");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        if ((a<0)&&(a%2==0)) {
            System.out.println("отрицательное четное число");}
        else if((a<0)&&(a%2!=0)){
            System.out.println("отрицательное нечетное число");}
        else if (a == 0){
            System.out.println("ноль"); }
        else if ((a>0)&&(a%2==0)){
            System.out.println("положительное четное число");}
        else if((a>0)&&(a%2!=0)){
            System.out.println("положительное нечетное число"); }
    }
    public static void task7() {
        //Москва - 905
        //Ростов - 194
        //Краснодар - 491
        //Киров - 800
        boolean flag = true;
        while (flag == true) {
            System.out.println("Задание 7");
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите код интересующего Вас города: ");
            int a = sc.nextInt();
            double Moscow = 4.15;
            double Rostov = 1.98;
            double Krasnodar = 2.69;
            double Kirov = 5.00;
            switch (a) {
                case (905):
                    System.out.println("Москва. Стоимость разговора: " + Moscow * 10);
                    flag = false;
                    break;
                case (194):
                    System.out.println("Ростов. Стоимость разговора: " + Rostov * 10);
                    flag = false;
                    break;
                case (491):
                    System.out.println("Краснодар. Стоимость разговора: " + Krasnodar * 10);
                    flag = false;
                    break;
                case (800):
                    System.out.println("Киров. Стоимость разговора: " + Kirov * 10);
                    flag = false;
                    break;
            }
        }
    }
    public static void task8(){
        System.out.println("Задание 8");
        int[] Array = {1,-10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(Array); //Сортировка эл-тов массива по возрастанию
        int maxNum = Array[Array.length - 1];
        System.out.println("Максимальное число в массиве: " + maxNum);
        int sum1 = 0;
        for (int i = 0; i < Array.length; i++){ //вхождение в массив
            if (Array[i] > 0){ //если эл-т положительный
                sum1 += Array[i]; //суммируем
            }
        }
        System.out.println("Сумма положительных эл-тов: " + sum1);
        int sum2 = 0;
        for (int i = 0; i < Array.length; i++){ //вхождение в массив
            if (Array[i] < 0 && Array[i]%2==0){ //если эл-т четный и отрицательный
                sum2 += Array[i]; //суммируем
            }
        }
        System.out.println("Сумма чётных отрицательных чисел: " + sum2);
        int kolvo1 = 0;
        for (int i = 0; i < Array.length; i++){
            if (Array[i] > 0){ //если эл-т положительный
                kolvo1 += 1; //прибавляем 1 к счётчику
            }
        }
        System.out.println("Кол-во положительных эл-тов: " + kolvo1);
        double sum3 = 0;
        int kolvo2 = 0;
        for (int i = 0; i < Array.length; i++){
            if (Array[i] < 0){ //если эл-т отрицательный
                sum3 += Array[i];
                kolvo2 += 1; //прибавляем 1 к счётчику
            }
        }
        double avg = sum3/kolvo2;
        System.out.println("Среднеарифметическое отрицательных эл-тов: " + avg);
    }
    public static void task9(){
        System.out.println("Задание 9");
        int[] Array = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        for (int i = Array.length-1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void task10(){
        System.out.println(" ");
        System.out.println("Задание 10");
        int[] Array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        System.out.println("Исходный массив: " + Arrays.toString(Array));
        int temp;
        for (int i = 0; i < Array.length; i++){
            if (Array[i] == 0){
                for (int j = i + 1; j < Array.length; j++){
                    if (Array[j] != 0){
                        temp = Array[j];
                        Array[j] = Array[i];
                        Array[i] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(Array));
    }
}