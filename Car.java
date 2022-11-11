public class Car{
    String name;
    static int avg;
    String color;
    static float price=100;
    int[] dim;

    public void run(){
        System.out.println("Car is running");
        System.out.println(price);
    }

    public static void printAvg(){
        System.out.println(avg);
    }
}