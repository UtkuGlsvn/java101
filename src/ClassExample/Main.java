package ClassExample;

public class Main {
    public static void main(String[] args) {
        City mycity = new City();
        City mycity2 = new City("Ankara",1051269);
        System.out.println("city name:  "+mycity2.getName()+"  population:  "+mycity2.getPopulation());
    }
}
